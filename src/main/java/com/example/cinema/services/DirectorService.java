package com.example.cinema.services;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.models.DirectorEntity;

import java.util.List;

public interface DirectorService {

    DirectorEntity createDirector(DirectorEntity director);
    List<MovieDto> getMovies(Integer director_id);
}
