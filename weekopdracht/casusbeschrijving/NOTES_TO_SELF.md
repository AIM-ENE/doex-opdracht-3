# GEDACHTES OVER DE CASUS

Het maken van een goed API ontwerp is grappig genoeg complexer dan ik dacht en ik wil in de weekcasus de studenten niet te veel afleiden van de implementatie in Spring Data JDBC. 

Daarom geef ik de data die de API moet verwerken in JSON.

De relatie tussen Bezoeker en Dagplanning is een veel op veel relatie (want Dagplanningen kunnen gedeeld worden door meerdere bezoekers). Het zijn wel afzonderlijke aggregates, maar je hebt wel een koppeltabel nodig en die complexiteit wilde ik er nog even niet in hebben.

Het identificeren van de juiste dagplanning is best ingewikkeld. Je hebt de datum nodig en het id van de bezoeker. 

