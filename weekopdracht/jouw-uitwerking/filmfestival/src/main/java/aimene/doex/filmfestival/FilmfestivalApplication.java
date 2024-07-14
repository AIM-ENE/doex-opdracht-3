package aimene.doex.filmfestival;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class FilmfestivalApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmfestivalApplication.class, args);
	}

	@Bean
	CommandLineRunner run(FilmRepository filmRepository,
						  DagplanningRepository dagplanningRepository) {
		return args -> {

			List<Film> films = List.of(
					new Film("Gone With The Wind", 238),
					new Film("The Wizard of Oz", 101),
					new Film("Roman Holiday", 118),
					new Film("Singin' in the Rain", 103),
					new Film("Lawrence of Arabia", 216),
					new Film("Casablanca", 102),
					new Film("Double Indemnity", 107),
					new Film("West Side Story", 152)
			);

			filmRepository.saveAll(films);

			Dagplanning dagplanning = new Dagplanning(LocalDate.of(2024, 10, 10));
			dagplanningRepository.save(dagplanning);
		};
	}
}
