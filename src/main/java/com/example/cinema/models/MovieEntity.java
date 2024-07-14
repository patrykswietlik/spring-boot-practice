package com.example.cinema.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class MovieEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private StudioEntity studio;

    @ManyToOne
    @JoinColumn(name = "director_id")
    @JsonManagedReference
    private DirectorEntity director;

    @ManyToMany
    @JoinTable(name = "screening",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name="cinema_id"))
    private List<CinemaEntity> cinemas;
}
