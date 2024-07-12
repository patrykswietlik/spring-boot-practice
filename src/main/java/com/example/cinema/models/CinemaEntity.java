package com.example.cinema.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CinemaEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Embedded
    private AddressEntity address;

    @ManyToMany(mappedBy = "cinemas")
    private List<MovieEntity> movies;
}
