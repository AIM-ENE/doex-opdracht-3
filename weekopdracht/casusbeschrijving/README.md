# Festival Planner 

De casus is hetzelfde als die van vorige week, maar nu kunnen meerdere gebruikers samen vertoningen aan een gedeelde dagplanning toevoegen.

Om de opdracht niet te groot te maken, zijn er een aantal simplificaties gedaan: 

- Het filmfestival vindt plaats op 1 dag en op 1 locatie (dus datum en locatie worden niet opgeslagen)
- Er is geen aparte klasse voor 
- Als er een overlap is tussen twee onderdelen wordt er direct een exception gegooid (en geen waarschuwingsobject).

Zie het klassendiagram in ` ./casusbeschrijving/klassendiagram-domein`


## Opdracht

Het filmfestival publiceert een lijst met Vertoningen die allemaal op dezelfde dag en op dezelfde plek plaatsvinden. Gebruikers kunnen aan hun een dagplanning onderdelen toevoegen op basis van vertoningen.

Ook moeten twee gebruikers onderdelen aan dezelfde dagplanning kunnen toevoegen en moet er op het goede moment een OptimisticLockingException optreden.

In `./sequentiediagram` vind je een voorbeeld van een sequentiediagram voor het toevoegen van een vertoning. Hierin zie je ook het JSON-format dat gebruikt moet worden voor de input.

In `./klassendiagram-domein` vind je het klassendiagram met indeling in aggregates die je voor deze opdracht moet gebruiken.

Implementeer deze functionaliteit als Spring Boot Applicatie met Spring Data JDBC.

## Starter code

In de map `./jouw-uitwerking/filmfestival` vind je de starter code. 

In `./jouw-uitwerking/filmfestival/README.md` vind je een tekst met een handreiking voor het starten en testen van de applicatie en de code die je moet schrijven.

