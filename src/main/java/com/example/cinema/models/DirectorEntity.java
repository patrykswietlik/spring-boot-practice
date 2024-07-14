package com.example.cinema.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class DirectorEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private Integer age;

    @OneToMany(mappedBy = "director")
    @JsonBackReference
    private List<MovieEntity> movies;
}
