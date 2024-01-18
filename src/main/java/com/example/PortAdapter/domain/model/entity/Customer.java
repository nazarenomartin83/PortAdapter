package com.example.PortAdapter.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Customer {
    @Id
    private Long id;
    private String name;
    private String surname;
    private String email;
    //private Company company;
}
