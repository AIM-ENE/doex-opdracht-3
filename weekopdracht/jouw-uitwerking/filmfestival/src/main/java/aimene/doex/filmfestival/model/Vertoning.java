package aimene.doex.filmfestival.model;


import org.springframework.data.annotation.Id;

import java.time.LocalTime;

public record Vertoning(@Id Integer id,
                        String film,
                        LocalTime starttijd,
                        LocalTime eindtijd) {
}
