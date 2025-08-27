package aimene.doex.filmfestival.controller;

import aimene.doex.filmfestival.model.Dagplanning;
import aimene.doex.filmfestival.model.Vertoning;
import aimene.doex.filmfestival.model.Onderdeel;
import aimene.doex.filmfestival.repository.DagplanningRepository;
import aimene.doex.filmfestival.repository.VertoningRepository;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dagplanningen")
public class DagplanningController {

    private final DagplanningRepository dagplanningRepository;

    public DagplanningController(
            DagplanningRepository dagplanningRepository,
            VertoningRepository vertoningRepository) {
        this.dagplanningRepository = dagplanningRepository;
    }

    @GetMapping("{id}")
    public Dagplanning findById(@PathVariable("id") Dagplanning dagplanning)
    {
        return dagplanning;
    }

    @PostMapping("{id}/vertoningen/{vertoning_id}")
    public void voegVertoningToe(@PathVariable("id") Dagplanning dagplanning,
                                 @PathVariable("vertoning_id") Vertoning vertoning) {

        AggregateReference<Vertoning, Integer> vertoningRef = AggregateReference.to(vertoning.id());

        dagplanning.voegToe(new Onderdeel(vertoningRef, vertoning.starttijd(), vertoning.eindtijd()));
        dagplanningRepository.save(dagplanning);

    }
}
