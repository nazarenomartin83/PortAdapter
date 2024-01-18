package com.example.PortAdapter.infrastructure.adapter.service;

import com.example.PortAdapter.domain.entity.Company;
import com.example.PortAdapter.domain.port.ICompanyPort;
import com.example.PortAdapter.infrastructure.adapter.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyAdapter implements ICompanyPort {
    private final CompanyRepository companyRepository;
    @Override
    public Company create(Company entity) {
        return this.companyRepository.save(entity);
    }

    @Override
    public Optional<Company> getById(Long id) {
        return this.companyRepository.findById(id);
    }

    @Override
    public List<Company> getAll() {
        return this.companyRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Company update(Company entity) {
        return null;
    }
}
