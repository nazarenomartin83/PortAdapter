package com.example.PortAdapter.infrastructure.adapter.service;

import com.example.PortAdapter.domain.entity.Customer;
import com.example.PortAdapter.domain.port.ICustomerPort;
import com.example.PortAdapter.infrastructure.adapter.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerAdapter implements ICustomerPort {

    private final CustomerRepository customerRepository;
    @Override
    public Customer create(Customer entity) {
        return null;
    }
    @Override
    public Optional<Customer> getById(Long id) {
        return null;
    }
    @Override
    public List<Customer> getAll() {
        return null;
    }
    @Override
    public void deleteById(Long id) {

    }
    @Override
    public Customer update(Customer entity) {
        return null;
    }
}
