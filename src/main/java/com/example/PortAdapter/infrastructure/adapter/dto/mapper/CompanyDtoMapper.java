package com.example.PortAdapter.infrastructure.adapter.dto.mapper;

import com.example.PortAdapter.infrastructure.adapter.dto.CompanyDTO;
import com.example.PortAdapter.domain.entity.Company;

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
