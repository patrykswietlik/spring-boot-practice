package com.example.cinema.controllers;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.models.DirectorEntity;
import com.example.cinema.services.DirectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/directors")
public class DirectorController{

    private final DirectorService directorService;

    @PostMapping("")
    public DirectorEntity createDirector(@RequestBody DirectorEntity director) {
        return directorService.createDirector(director);
    }

    @GetMapping("/{id}/movies")
    public List<MovieDto> getDirectorMovies(@PathVariable Integer id) {
        return directorService.getMovies(id);
    }


}
