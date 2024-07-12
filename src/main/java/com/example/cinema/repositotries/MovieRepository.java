package com.example.cinema.repositotries;

import com.example.cinema.models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    List<MovieEntity> findAllByTitleContainingIgnoreCase(String text);
}
