package aimene.doex.filmfestival;

import aimene.doex.filmfestival.model.Dagplanning;
import aimene.doex.filmfestival.model.Vertoning;
import aimene.doex.filmfestival.repository.DagplanningRepository;
import aimene.doex.filmfestival.repository.VertoningRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
public class FilmfestivalApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmfestivalApplication.class, args);
    }

    @Bean
    CommandLineRunner run(VertoningRepository vertoningRepository,
                          DagplanningRepository dagplanningRepository) {
        return args -> {

            List<Vertoning> vertoningen = List.of(
                    new Vertoning(null,"Gone With The Wind", LocalTime.of(9,0), LocalTime.of(12, 58)),
                    new Vertoning(null,"The Wizard of Oz", LocalTime.of(10, 30), LocalTime.of(12, 11)),
                    new Vertoning(null,"Roman Holiday", LocalTime.of(12, 0), LocalTime.of(13, 58)),
                    new Vertoning(null,"Singin' in the Rain",LocalTime.of(13, 30), LocalTime.of(15, 13)),
                    new Vertoning(null,"Lawrence of Arabia", LocalTime.of(15, 0), LocalTime.of(18, 36)),
                    new Vertoning(null,"Casablanca", LocalTime.of(16, 30), LocalTime.of(18, 12)),
                    new Vertoning(null,"Double Indemnity", LocalTime.of(18, 0), LocalTime.of(19, 47)),
                    new Vertoning(null,"West Side Story", LocalTime.of(19, 30), LocalTime.of(22, 2))
            );

            vertoningRepository.saveAll(vertoningen);

            Dagplanning dagplanning = new Dagplanning(LocalDate.of(2025, 10, 10));
            dagplanningRepository.save(dagplanning);
        };
    }
}
