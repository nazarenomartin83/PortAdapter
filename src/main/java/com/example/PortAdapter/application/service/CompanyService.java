package com.example.PortAdapter.application.service;

import com.example.PortAdapter.application.mapper.CompanyDtoMapper;
import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.domain.dto.CompanyDTO;
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
    public CompanyDTO create(CompanyDTO companyDTO) {
        // Ejecuta caso de uso.
        Optional<Company> company = this.companyPort.getById(companyDTO.getId());
        if (company.isPresent())
            throw new CompanyException(HttpStatus.CONFLICT,COMPANY_EXIST);
        return companyDtoMapper.entityToDto(this.companyPort.create(companyDtoMapper.dtoToEntity(companyDTO)));
    }

    @Override
    public CompanyDTO update(CompanyDTO companyDTO) {
        return null;
    }

    @Override
    public CompanyDTO getById(Long id) {
        Optional<Company> company = this.companyPort.getById(id);
        if (company.isEmpty())
            throw new CompanyException(HttpStatus.CONFLICT,COMPANY_NOT_FOUND);
        return companyDtoMapper.entityToDto(company.get());
    }

    @Override
    public CompanyDTO delete(Long id) {
        return null;
    }

    @Override
    public List<CompanyDTO> getAll() {
        List <Company> companies = this.companyPort.getAll();
        return companies
                .stream()
                .map(companyDtoMapper::entityToDto)
                .toList();
    }
}
