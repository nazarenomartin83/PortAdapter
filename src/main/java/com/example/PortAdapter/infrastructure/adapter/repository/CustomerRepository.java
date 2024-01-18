package com.example.PortAdapter.infrastructure.adapter.repository;

import com.example.PortAdapter.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
