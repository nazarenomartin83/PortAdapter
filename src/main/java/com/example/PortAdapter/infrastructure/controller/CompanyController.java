package com.example.PortAdapter.infrastructure.controller;

import com.example.PortAdapter.application.usecase.ICompanyService;
import com.example.PortAdapter.domain.dto.CompanyDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {
    private final ICompanyService companyService;
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(companyService.getById(id));
        //return companyService.getById(id);
    }

    @GetMapping
    public List<CompanyDTO> getAll() {
        return companyService.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
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
