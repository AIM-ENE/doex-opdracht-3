package aimene.doex.filmfestival.repository;

import aimene.doex.filmfestival.model.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film, Integer> {
}
