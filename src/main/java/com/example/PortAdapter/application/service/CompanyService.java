package com.example.PortAdapter.application.service;

import com.example.PortAdapter.application.mapper.CompanyDtoMapper;
import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.domain.model.dto.CompanyDTO;
import com.example.PortAdapter.domain.model.entity.Company;
import com.example.PortAdapter.domain.model.entity.Customer;
import com.example.PortAdapter.domain.model.port.ICompanyPort;

import java.util.Collections;
import java.util.List;

public class CompanyService implements ICompanyService {
    private final ICompanyPort companyPort;
    private final CompanyDtoMapper companyDtoMapper;

    public CompanyService(ICompanyPort companyPort, CompanyDtoMapper companyDtoMapper) {
        this.companyPort = companyPort;
        this.companyDtoMapper = companyDtoMapper;
    }

    @Override
    public CompanyDTO create(CompanyDTO companyDTO) {
        // Ejecuta caso de uso.
        return companyDtoMapper.entityToDto(this.companyPort.create(companyDtoMapper.dtoToEntity(companyDTO)));
    }

    @Override
    public CompanyDTO update(CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public CompanyDTO getById(Long id) {
        return companyDtoMapper.entityToDto(this.companyPort.getById(id));
    }

    @Override
    public CompanyDTO delete(Long id) {
        return null;
    }

    @Override
    public List<CompanyDTO> getAll() {
        List <Company> customers = this.companyPort.getAll();
        return customers
                .stream()
                .map(companyDtoMapper::entityToDto)
                .toList();
    }
}
