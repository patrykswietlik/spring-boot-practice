package com.example.cinema.controllers;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("")
    public List<MovieDto> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public MovieDto getMovieById(@PathVariable Integer id) {
        return movieService.getMovieById(id);
    }

    @GetMapping("/search")
    public List<MovieDto> getMovieByTitle(@RequestParam(required = false) String title) {
        return movieService.getMoviesByTitle(title);
    }

    @PostMapping("")
    public MovieDto createMovie(@RequestBody MovieDto movieDTO) {
        return movieService.createMovie(movieDTO);
    }
}
