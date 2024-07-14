package aimene.doex.filmfestival.controller;

import java.time.LocalTime;

public record ProgrammaItemDTO(Integer filmId, String locatie, LocalTime starttijd) {
}
