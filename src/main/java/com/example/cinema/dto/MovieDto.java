package com.example.cinema.dto;

public record MovieDto(
        Integer id,
        String title,
        String description,
        Integer directorId
) {
}
