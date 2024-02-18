package com.example.PortAdapter.infrastructure.controller;

import com.example.PortAdapter.infrastructure.adapter.dto.mapper.CompanyDtoMapper;
import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.infrastructure.adapter.dto.CompanyDTO;
import com.example.PortAdapter.domain.entity.Company;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {
    private final ICompanyService companyService;
    private final CompanyDtoMapper companyDtoMapper;
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getById(@PathVariable Long id) {
        CompanyDTO companyDTO = companyDtoMapper.entityToDto(companyService.getById(id));
        return ResponseEntity.ok(companyDTO);
    }

    @GetMapping
    public List<CompanyDTO> getAll() {
        List<Company> companies = companyService.getAll();
        return companies
            .stream()
            .map(companyDtoMapper::entityToDto)
            .toList();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompanyDTO create(@RequestBody CompanyDTO companyDTO)
    {
        Company company = companyDtoMapper.dtoToEntity(companyDTO);
        return companyDtoMapper.entityToDto(companyService.create(company));
    }
    @PutMapping
    public  CompanyDTO update(@RequestBody CompanyDTO companyDTO)
    {
        Company company = companyDtoMapper.dtoToEntity(companyDTO);
        return companyDtoMapper.entityToDto(companyService.update(company));
    }

    @DeleteMapping("/{id}")
    public CompanyDTO delete(@PathVariable Long id)
    {
        return companyDtoMapper.entityToDto(companyService.delete(id));
    }
}
