package com.example.cinema.services;

import com.example.cinema.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> getAllMovies();

    MovieDto getMovieById(Integer id);

    MovieDto createMovie(MovieDto movieDTO);

    List<MovieDto> getMoviesByTitle(String title);

}
