package com.example.PortAdapter.infrastructure.adapter.service;

import com.example.PortAdapter.domain.model.entity.Company;
import com.example.PortAdapter.domain.model.port.ICompanyPort;
import com.example.PortAdapter.infrastructure.adapter.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyAdapter implements ICompanyPort {
    private final CompanyRepository companyRepository;
    @Override
    public Company create(Company entity) {
        return null;
    }

    @Override
    public Company getById(Long id) {
        return null;
    }

    @Override
    public List<Company> getAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Company update(Company entity) {
        return null;
    }
}
