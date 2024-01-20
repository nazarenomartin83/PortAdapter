package com.example.PortAdapter.application.mapper;

import com.example.PortAdapter.domain.dto.CompanyDTO;
import com.example.PortAdapter.domain.entity.Company;
import org.springframework.stereotype.Service;

public class CompanyDtoMapper implements IEntityDtoMapper<Company, CompanyDTO> {
    @Override
    public Company dtoToEntity(CompanyDTO dto) {
        return Company.builder().id(dto.getId())
                .name(dto.getName())
                .address(dto.getAddress())
                .build();
    }
    @Override
    public CompanyDTO entityToDto(Company entity) {
        return CompanyDTO.builder().id(entity.getId())
                .name(entity.getName())
                .address(entity.getAddress())
                .build();
    }
}
