package com.example.cinema.repositotries;

import com.example.cinema.models.CinemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<CinemaEntity, Integer> {
}
