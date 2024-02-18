package com.example.PortAdapter.application.service;

import com.example.PortAdapter.infrastructure.adapter.dto.mapper.CompanyDtoMapper;
import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.domain.entity.Company;
import com.example.PortAdapter.domain.port.ICompanyPort;
import com.example.PortAdapter.infrastructure.handle.CompanyException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.PortAdapter.domain.constant.GlobalError.COMPANY_EXIST;
import static com.example.PortAdapter.domain.constant.GlobalError.COMPANY_NOT_FOUND;

@Service
@AllArgsConstructor
public class CompanyService implements ICompanyService {
    private final ICompanyPort companyPort;
    private final CompanyDtoMapper companyDtoMapper;

    @Override
    public Company create(Company entity) {
        // Ejecuta caso de uso.
        Optional<Company> company = this.companyPort.getByPK(entity.getName());
        if (company.isPresent())
            throw new CompanyException(HttpStatus.CONFLICT,COMPANY_EXIST);
        entity.setCreateTime();
        return this.companyPort.create(entity);
    }

    @Override
    public Company update(Company entity) {
        return null;
    }

    @Override
    public Company getById(Long id) {
        Optional<Company> company = this.companyPort.getById(id);
        if (company.isEmpty())
            throw new CompanyException(HttpStatus.CONFLICT,COMPANY_NOT_FOUND);
        return company.get();
    }

    @Override
    public Company delete(Long id) {
        return null;
    }

    @Override
    public List<Company> getAll() {
        return this.companyPort.getAll();
    }
}
