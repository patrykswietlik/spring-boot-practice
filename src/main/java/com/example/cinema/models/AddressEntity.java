package com.example.cinema.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AddressEntity {

    private String street;
    private String number;
    private String city;
    private String zipCode;
}
