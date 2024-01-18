package com.example.PortAdapter.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Company {
    @Id
    private Long id;
    private String name;
    private String address;
    //private List<Customer> customers;
}
