package com.example.PortAdapter.infrastructure.adapter.repository;

import com.example.PortAdapter.domain.model.entity.Company;
import com.example.PortAdapter.domain.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {

}
