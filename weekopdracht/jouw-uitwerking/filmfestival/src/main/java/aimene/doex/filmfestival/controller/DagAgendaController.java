package aimene.doex.filmfestival.controller;

import aimene.doex.filmfestival.model.DagAgenda;
import aimene.doex.filmfestival.model.Film;
import aimene.doex.filmfestival.model.Vertoning;
import aimene.doex.filmfestival.repository.DagAgendaRepository;
import aimene.doex.filmfestival.repository.FilmRepository;
import org.springframework.data.jdbc.core.mapping.AggregateReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dagagendas")
public class DagAgendaController {

    private final DagAgendaRepository dagAgendaRepository;

    private final FilmRepository filmRepository;

    public DagAgendaController(
            DagAgendaRepository dagAgendaRepository,
            FilmRepository filmRepository) {
        this.dagAgendaRepository = dagAgendaRepository;
        this.filmRepository = filmRepository;
    }

    @GetMapping("{id}")
    public DagAgenda findById(@PathVariable("id") DagAgenda dagAgenda) {
        return dagAgenda;
    }

    @PostMapping("{id}/vertoningen")
    public void voegVertoningToe(@PathVariable("id") DagAgenda dagAgenda,
                            @RequestBody ProgrammaItemDTO programmaItemDTO) {



    }
}
