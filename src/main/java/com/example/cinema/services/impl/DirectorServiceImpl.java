package com.example.cinema.services.impl;

import com.example.cinema.dto.MovieDto;
import com.example.cinema.models.DirectorEntity;
import com.example.cinema.repositotries.DirectorRepository;
import com.example.cinema.services.DirectorService;
import com.example.cinema.services.MovieDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;
    private final MovieDtoMapper movieDtoMapper;

    @Override
    public DirectorEntity createDirector(DirectorEntity director) {
        return directorRepository.save(director);
    }

    @Override
    public List<MovieDto> getMovies(Integer director_id) {
        // temporarily, an exception should be raised if the director is not found
        DirectorEntity director = directorRepository.findById(director_id).orElse(new DirectorEntity());
        return movieDtoMapper.moviesToMoviesDto(director.getMovies());
    }
}
