package aimene.doex.bestelling.controller;

import aimene.doex.bestelling.model.Bestelling;
import aimene.doex.bestelling.model.Geld;
import aimene.doex.bestelling.model.Product;
import aimene.doex.bestelling.model.Valuta;
import aimene.doex.bestelling.repository.ProductRepository;
import aimene.doex.bestelling.repository.BestellingRepository;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/producten")
public class ProductController {

    private final ProductRepository productRepository;
    private final BestellingRepository bestellingRepository;

    public ProductController(ProductRepository productRepository, BestellingRepository bestellingRepository) {
        this.productRepository = productRepository;
        this.bestellingRepository = bestellingRepository;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable("id") Product product) {
        return product;
    }

    @PatchMapping("{id}/prijs")
    public void veranderPrijs(@PathVariable("id") Product product,
                               @RequestBody Map<String, Object> requestBody) {

        /* ******************************************************************** */
        // Geef in het sequentiediagram wel expliciet aan dat je het product
        // ophaalt uit de repository met een findById(productId)
        // daarmee wordt het makkelijker te zien wanneer er een
        // optimistic lock exception kan optreden
        // (zie voorbeeld in het sequentiediagram)
        /* ******************************************************************** */

        /* ******************************************************************** */
        // Deze regel hoef je niet op te nemen in het sequentiediagram
        // Je kunt ervan uitgaan dat de nieuwePrijs wordt meegegeven door de
        // actor bij aanroep van de methode veranderPrijs van deze controller
        Geld nieuwePrijs = new Geld((int) requestBody.get("nieuwe_prijs"), Valuta.EUR);
        /* ******************************************************************** */

        /* ******************************************************************** */
        // Geef deze regel in het sequentiediagram aan met een rnote
        // (zie voorbeeld in het sequentiediagram)
        product.veranderPrijs(nieuwePrijs);
        /* ******************************************************************** */

        productRepository.save(product);

        /* ******************************************************************** */
        // Deze regel hoef je niet op te nemen in het sequentiediagram
        AggregateReference<Product, Integer> productRef =
                AggregateReference.to(product.getId());
        /* ******************************************************************** */

        /* ******************************************************************** */
        // Vind alle bestellingen die het product bevatten waarvan de prijs is veranderd
        // Dit kan beter met een sql-query, maar dat doen we volgende week
        // In het Sequentiediagram kun je ervan uitgaan dat er een methode bestaat
        // bestellingRepository.findAllMetProduct(productId) die dit voor je doet;
        Iterable<Bestelling> bestellingen = bestellingRepository.findAll();

        List<Bestelling> bestellingenMetProduct = StreamSupport.stream(bestellingen.spliterator(), false)
                .filter(bestelling -> bestelling.bevatBestellingProduct(productRef))
                .collect(Collectors.toList());
        /* ******************************************************************** */

        /* ******************************************************************** */
        // Geef dit in het sequentiediagram aan met een rnote
        // Verander de stukprijs van het product in de eerder gevonden bestellingen
        bestellingenMetProduct.forEach(bestelling -> bestelling.veranderStukPrijs(productRef, nieuwePrijs));
        /* ******************************************************************** */

        bestellingRepository.saveAll(bestellingenMetProduct);
    }
}

