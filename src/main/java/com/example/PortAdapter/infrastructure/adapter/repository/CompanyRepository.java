package com.example.PortAdapter.infrastructure.adapter.repository;

import com.example.PortAdapter.domain.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

}
