package com.example.PortAdapter.infrastructure.adapter.repository;

import com.example.PortAdapter.infrastructure.adapter.repository.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {
    Optional<Company> findByName(String name);
}
