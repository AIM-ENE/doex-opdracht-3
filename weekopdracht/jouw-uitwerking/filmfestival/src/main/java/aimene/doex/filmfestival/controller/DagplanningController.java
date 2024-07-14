package aimene.doex.filmfestival.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dagplanningen")
public class DagplanningController {

    private final DagplanningRepository dagplanningRepository;
    private final FilmRepository filmRepository;

    public DagplanningController(
            DagplanningRepository dagplanningRepository,
            FilmRepository filmRepository) {
        this.dagplanningRepository = dagplanningRepository;
        this.filmRepository = filmRepository;
    }

    @GetMapping("{id}")
    public Dagplanning findById(@PathVariable("id") Dagplanning dagplanning) {
        return dagplanning;
    }

    @PostMapping("{id}/vertoningen")
    public void voegVertoningToe(@PathVariable("id") Dagplanning dagplanning,
                            @RequestBody ProgrammaItemDTO programmaItemDTO) {

    }
}
