package com.example.cinema.services;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.models.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MovieDtoMapper {
    MovieDto movieToMovieDto(MovieEntity movie);
    List<MovieDto> moviesToMoviesDto(List<MovieEntity> movies);
}
