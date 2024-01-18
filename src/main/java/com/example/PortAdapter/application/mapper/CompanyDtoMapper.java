package com.example.PortAdapter.application.mapper;

import com.example.PortAdapter.domain.model.dto.CompanyDTO;
import com.example.PortAdapter.domain.model.entity.Company;

public class CompanyDtoMapper implements IEntityDtoMapper<Company, CompanyDTO> {
    @Override
    public Company dtoToEntity(CompanyDTO dto) {
        return Company.builder().id(dto.getId())
                .name(dto.getName())
                .address(dto.getAddress())
                .build();
    }

    @Override
    public CompanyDTO entityToDto(Company Entity) {
        return null;
    }
}
