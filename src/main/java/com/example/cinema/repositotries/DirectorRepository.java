package com.example.cinema.repositotries;

import com.example.cinema.models.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<DirectorEntity, Integer> {
}
