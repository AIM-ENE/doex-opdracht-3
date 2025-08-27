package aimene.doex.filmfestival.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Dagplanning {

    @Id
    private Integer id;

    @Version
    private Integer versie;

    private LocalDate datum;

    private Set<Onderdeel> onderdelen = new HashSet<>();


    public Dagplanning(LocalDate datum) {
        this.datum = datum;
    }

    public void voegToe(Onderdeel nieuweOnderdeel) {
        if (!bevatOverlappingMet(nieuweOnderdeel)) {
            onderdelen.add(nieuweOnderdeel);
        } else {
            throw new IllegalArgumentException("Vertoning overlapt met een andere vertoning");
        }
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    private boolean bevatOverlappingMet(Onderdeel onderdeel) {
        return onderdelen.stream()
                .anyMatch(v -> v.overlaptMet(onderdeel));
    }

    public Set<Onderdeel> getOnderdelen() {
        return onderdelen;
    }

    @Override
    public String toString() {
        return "Dagplanning{" +
                "id=" + id +
                ", versie=" + versie +
                ", datum=" + datum +
                ", onderdelen=" + onderdelen +
                '}';
    }
}
