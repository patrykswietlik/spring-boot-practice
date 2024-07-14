package com.example.cinema.services;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.models.MovieEntity;

import java.util.List;

public interface MovieService {

    List<MovieDto> getAllMovies();

    MovieEntity getMovieById(Integer id);

    MovieDto createMovie(MovieDto movieDTO);

    List<MovieDto> getMoviesByTitle(String title);

}
