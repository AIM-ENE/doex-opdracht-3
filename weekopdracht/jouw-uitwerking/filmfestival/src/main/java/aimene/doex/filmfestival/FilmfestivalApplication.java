package aimene.doex.filmfestival;

import aimene.doex.filmfestival.model.DagAgenda;
import aimene.doex.filmfestival.model.Film;
import aimene.doex.filmfestival.repository.DagAgendaRepository;
import aimene.doex.filmfestival.repository.FilmRepository;
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
						  DagAgendaRepository dagAgendaRepository) {
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

			DagAgenda dagAgenda = new DagAgenda(LocalDate.of(2024, 10, 10));
			dagAgendaRepository.save(dagAgenda);
		};
	}
}
