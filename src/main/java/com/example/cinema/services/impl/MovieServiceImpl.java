package com.example.cinema.services.impl;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.exceptions.MovieNotFoundException;
import com.example.cinema.models.DirectorEntity;
import com.example.cinema.models.MovieEntity;
import com.example.cinema.repositotries.DirectorRepository;
import com.example.cinema.repositotries.MovieRepository;
import com.example.cinema.services.MovieDtoMapper;
import com.example.cinema.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;
    private final DirectorRepository directorRepository;
    private final MovieDtoMapper movieDtoMapper;

    @Override
    public List<MovieDto> getAllMovies() {
        return movieDtoMapper.moviesToMoviesDto(movieRepository.findAll());
    }

    @Override
    public MovieEntity getMovieById(Integer id) {
        return movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException("Movie with id " + id + " was not found"));
    }

    @Override
    public MovieDto createMovie(MovieDto movieDTO) {
        MovieEntity movie = MovieEntity.builder()
                .title(movieDTO.title())
                .description(movieDTO.description())
                .build();

        // temporarily, an exception should be raised if the director is not found
        DirectorEntity director = directorRepository.findById(movieDTO.directorId()).orElse(new DirectorEntity());
        movie.setDirector(director);
        MovieEntity createdMovie = movieRepository.save(movie);

        return movieDtoMapper.movieToMovieDto(createdMovie);
    }

    @Override
    public List<MovieDto> getMoviesByTitle(String title) {
        List<MovieEntity> movies = movieRepository.findAllByTitleContainingIgnoreCase(title);
        return movieDtoMapper.moviesToMoviesDto(movies);
    }
}

