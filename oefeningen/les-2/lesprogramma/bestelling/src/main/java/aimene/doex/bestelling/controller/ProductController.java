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

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable("id") Product product) {
        return product;
    }

}

