package com.example.PortAdapter.infrastructure.adapter.service;

import com.example.PortAdapter.domain.model.entity.Customer;
import com.example.PortAdapter.domain.model.port.ICustomerPort;
import com.example.PortAdapter.infrastructure.adapter.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerAdapter implements ICustomerPort {

    private final CustomerRepository customerRepository;
    @Override
    public Customer create(Customer entity) {
        return null;
    }
    @Override
    public Customer getById(Long id) {
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
    public Customer update(Customer user) {
        return null;
    }
}
