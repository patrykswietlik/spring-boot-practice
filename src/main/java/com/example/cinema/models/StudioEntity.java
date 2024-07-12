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
public class StudioEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String description;

    @Embedded
    private AddressEntity address;

    @OneToMany(mappedBy = "studio")
    private List<MovieEntity> movies;
}
