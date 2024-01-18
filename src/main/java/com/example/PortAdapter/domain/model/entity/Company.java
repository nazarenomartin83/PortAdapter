package com.example.PortAdapter.domain.model.entity;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Company {
    private String id;
    private String name;
    private String address;
    private List<Customer> customers;
}
