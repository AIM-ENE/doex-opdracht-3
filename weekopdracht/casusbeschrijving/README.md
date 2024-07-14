# Festival Planner 

De casus is hetzelfde als die van vorige week, maar nu kunnen meerdere gebruikers samen vertoningen aan een gedeelde dag agenda toevoegen.

Om de opdracht niet te groot te maken, gaat deze opdracht alleen over het toevoegen van vertoningen aan een DagAgenda van één dag.

## Opdracht

Het filmfestival publiceert het programma per dag en per zaal in JSON-format. De opdracht is het maken van een applicatie die een Vertoning kan toevoegen op basis van een programma-item uit het programma en de films die in de database staan.

Ook moeten twee gebruikers vertoningen aan dezelfde dagplanning kunnen toevoegen en moet er op het goede moment een OptimisticLockingException optreden.

In `./sequentiediagram` vind je een voorbeeld van een sequentiediagram voor het toevoegen van een vertoning. Hierin zie je ook het JSON-format dat gebruikt moet worden voor de input.

In `./klassendiagram-domein` vind je het klassendiagram met indeling in aggregates die je voor deze opdracht moet gebruiken.

Implementeer deze functionaliteit als Spring Boot Applicatie met Spring Data JDBC.

## Starter code

In de map `./jouw-uitwerking/filmfestival` vind je de starter code. 

In `./jouw-uitwerking/filmfestival/README.md` vind je een tekst met een handreiking voor het starten en testen van de applicatie en de code die je moet schrijven.

