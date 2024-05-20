# Discussie over kiezen van de aggregate

## Afspraken plannen

**Context:** Een systeem voor het plannen van afspraken van clienten bij een huisarts.
- **Klassen:** `Tijdslot`, `Client`, `Afpraak`
- **Business Regels:**
  1. Een tijdslot kan maar door 1 client geboekt worden
  2. Een client kan maar één afspraak per dag plannen
  3. Een client mag niet meer dan 20 afspraken per jaar plannen
  4. 2 slots binnen één afspraak moeten altijd aansluitend zijn
- **Methoden: maakAfspraak**

Een jaar bestaat uit 240 dagen waarop er gewerkt wordt.

Een dag bestaat uit 40 slots die elk 10 minuten duren. Een slot kan maar door één client geboekt worden.

Een client kan een afspraak maken bij een huisarts voor de duur van één, of twee slots (achter elkaar). Een client kan echter maar één afspraak per dag plannen en mag niet meer dan 20 afspraken per jaar plannen. 

## Opdracht 

Geef per optie aan a) welke business regels op strongly consistent kunnen worden afgedwongen en b) een voorbeeld van een onnodige Optimistic Locking Exception. Gebruik `jouw-uitwerking.md` om je antwoorden te noteren.