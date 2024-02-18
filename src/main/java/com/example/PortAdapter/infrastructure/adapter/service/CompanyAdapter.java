package com.example.PortAdapter.infrastructure.adapter.service;

import com.example.PortAdapter.domain.entity.Company;
import com.example.PortAdapter.domain.port.ICompanyPort;
import com.example.PortAdapter.infrastructure.adapter.repository.mapper.CompanyDbEntityMapper;
import com.example.PortAdapter.infrastructure.adapter.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CompanyAdapter implements ICompanyPort {
    private final CompanyRepository companyRepository;
    private final CompanyDbEntityMapper companyDbEntityMapper;
    @Override
    public Company create(Company entity) {
        var companyDb = companyDbEntityMapper.toDbo(entity);
        return companyDbEntityMapper.toDomain(Optional.of(companyRepository.save(companyDb)));
    }

    @Override
    public Optional<Company> getById(Long id) {
        return Optional.ofNullable(companyDbEntityMapper.toDomain(companyRepository.findById(id)));
    }

    @Override
    public Optional<Company> getByPK(String pk) {
        return Optional.ofNullable(companyDbEntityMapper.toDomain(companyRepository.findByName(pk)));
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll()
                .stream()
                .map(companyDbEntityMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Company update(Company entity) {
        return null;
    }
}
