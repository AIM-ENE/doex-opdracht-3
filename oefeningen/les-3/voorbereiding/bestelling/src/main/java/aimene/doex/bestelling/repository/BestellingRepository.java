package aimene.doex.bestelling.repository;

import aimene.doex.bestelling.model.Bestelling;
import org.springframework.data.repository.CrudRepository;

public interface BestellingRepository extends CrudRepository<Bestelling, Integer> {
}
