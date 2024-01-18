package com.example.PortAdapter.infrastructure.controller;

import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.domain.model.dto.CompanyDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@AllArgsConstructor
public class CompanyController {
    private final ICompanyService companyService;
    @GetMapping("/{id}")
    public CompanyDTO getById(@PathVariable Long id) {
        return companyService.getById(id);
    }

    @GetMapping
    public List<CompanyDTO> getAll() {
        return companyService.getAll();
    }
    @PostMapping
    public CompanyDTO create(@RequestBody CompanyDTO companyDTO)
    {
        return companyService.create(companyDTO);
    }
    @PutMapping
    public  CompanyDTO update(@RequestBody CompanyDTO companyDTO)
    {
        return companyService.update(companyDTO);
    }

    @DeleteMapping("/{id}")
    public CompanyDTO delete(@PathVariable Long id)
    {
        return companyService.delete(id);
    }
}
