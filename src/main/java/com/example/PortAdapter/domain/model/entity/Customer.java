package com.example.PortAdapter.domain.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String id;
    private String name;
    private String surname;
    private String email;
    private Company company;
}
