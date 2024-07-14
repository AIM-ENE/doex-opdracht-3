# Handreiking

## Starten van de applicatie

```
src/main/java/aimene/doex/filmfestival/FilmfestivalApplication.java
```

De SpringBootApplication is al aangemaakt. Deze klasse vult ook de database met een verzameling films en één DagAgenda. Je hoeft hier niets aan te veranderen.

## Testen 

```
http
```

In de map `http` vind je het bestand `test_dagplanning.http` die je kunt gebruiken om de API te testen.

Als het nodig is, kun je dit bestand aanpassen en tests toevoegen. Als je andere vertoningen wilt toevoegen dan de drie die er al instaan, gebruik dan de programma-items uit de twee JSON-files: `programma-zaal-1.json` en `programma-zaal-2.json`.

## Implementeren

Hieronder zie je enkele handreikingen voor het implementeren van de applicatie

### Controller 

```
src/main/java/aimene/doex/filmfestival/controller
```

`DagAgendaController.java` bevat de methode `voegVertoningToe`. Dit is de enige methode die je in de controller hoeft te implementeren.

De methode `voegVertoningToe` heeft de volgende parameter:  `@RequestBody ProgrammaItemDTO programmaItemDTO`. In de map `controller` zie vind je ook  het record `ProgrammaItemDTO`.

Deze constructie zorgt ervoor dat je de JSON-data die je meegeeft automatisch in de variabele `programmaItemDTO` wordt geplaatst `voegVertoningToe`.

### Model

```
src/main/java/aimene/doex/filmfestival/model
```

De map `model` bevat de klassen die je nodig hebt om de domeinlogica te implementeren. Deze zijn nog helemaal leeg. Gebruik eventueel het `klassendiagram-domein.puml` uit de casusomschrijving om de methodes en attributen te bepalen.

### Repository

```
src/main/java/aimene/doex/filmfestival/repository
```

De twee interfaces die je nodig hebt zijn al gedeclareerd. Als het goed is, hoef je hier niets aan te veranderen.

### Database

```
src/main/resources/schema.sql
```

De tabellen en kolommen zijn al gedefinieerd (op basis van de klassen en attributen uit het `klassendiagram-domein.puml`). 

De foreign key referenties zijn echter nog niet gedefinieerd. Dit moet je nog doen.