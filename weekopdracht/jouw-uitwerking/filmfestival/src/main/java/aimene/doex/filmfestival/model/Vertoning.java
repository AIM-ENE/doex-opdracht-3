package aimene.doex.filmfestival.model;

import org.springframework.data.jdbc.core.mapping.AggregateReference;

import java.time.LocalTime;

public record Vertoning(AggregateReference<Film, Integer> film,
                        String locatie,
                        LocalTime starttijd,
                        LocalTime eindtijd) {


}
