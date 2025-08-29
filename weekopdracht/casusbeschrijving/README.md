# Festival Planner 

De casus is hetzelfde als die van vorige week, maar nu kunnen meerdere gebruikers samen vertoningen aan een gedeelde dagplanning toevoegen. 

In deze opdracht ge je een gedeelte van Spring code schrijven om deze functionaliteit te realiseren 

Om de opdracht niet te groot te maken, zijn er een aantal simplificaties gedaan: 

- Het filmfestival vindt plaats op 1 dag en op 1 locatie (dus datum en locatie worden niet opgeslagen)
- Er is geen aparte klasse voor locatie, en film is simpelweg een string attribuut in de Vertoning klasse
- Als er een overlap is tussen twee onderdelen moet er een (domein/runtime) exception gegooid worden (en geen planningsconflict aangemaakt worden zoals in week 2 ontworpen is).

## Klassendiagram

Zie het klassendiagram in ` ./casusbeschrijving/klassendiagram-domein`
  

## Invariant

De volgende invariant is gegeven

- Binnen een dagplanning mogen twee onderdelen elkaar nooit overlappen

## Opdracht

Implementeer de Spring Code waarmee je ervoor zorgt dat er onderdelen kunnen worden toegevoegd aan een dagagenda en dat bovenstaande invariant nooit geschonden kan worden. 

De meeste code is al gegeven. Hieronder staan de twee dingen die je moet implementeren: 

- In `schema.sql` ontbreekt de SQL-code waarmee je de relaties kunt leggen volgens het klassendiagram.
- De klasse `Dagplanning` is leeg. Implementeer de code van deze klasse.


## Tips

- Begin met het inspecteren van de `DagplanningController` om de flow van de applicatie te doorgronden
- Er zijn al een aantal tests geschreven. Deze zijn te vinden in `http/test.http`
- De applicatie wordt geïnitialiseerd met voorbeelddata die in principe genoeg zou moeten zijn om de applicatie te testen. Zie `FilmfestivalApplication.java`.


