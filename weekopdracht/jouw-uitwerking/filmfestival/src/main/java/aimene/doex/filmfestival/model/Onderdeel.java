package aimene.doex.filmfestival.model;

import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalTime;

public record Onderdeel(AggregateReference<Vertoning, Integer> vertoning,
                        LocalTime starttijd,
                        LocalTime eindtijd) {

    public Onderdeel {
        if (eindtijd.isBefore(starttijd)) {
            throw new IllegalArgumentException("Eindtijd moet na starttijd liggen");
        }
    }


    public boolean overlaptMet(Onderdeel andereOnderdeel) {
        return starttijd.isBefore(andereOnderdeel.eindtijd) &&
                eindtijd.isAfter(andereOnderdeel.starttijd);
    }



}
