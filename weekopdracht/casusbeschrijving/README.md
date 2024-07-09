# Festival Planner Multi User

De casus is hetzelfde als die van vorige week, maar nu kunnen meerdere gebruikers samen vertoningen aan een gedeelde dagplanning toevoegen.

> NOTE:
> 
> Voor het gemak zijn Vertoningen nu Value Objects die gemaakt kunnen worden in de Controller.
> In werkelijkheid zou je deze Vertoningen misschien willen koppelen aan beschikbare vertoningen oid zodat je de geplande vertoningen kunt informeren dat er een wijziging heeft plaatsgevonden. Dat doen we nu niet, vanwege de complexiteit die dat met zich meebrengt. 
> 
> Daarom is film nu gewoon een string en geen Film object.