package com.example.cinema.repositotries;

import com.example.cinema.models.StudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudioRepository extends JpaRepository<StudioEntity, Integer> {
}
