package com.example.PortAdapter.infrastructure.adapter.dto.mapper;

public interface IEntityDtoMapper <E,D> {
    E dtoToEntity(D dto);
    D entityToDto(E entity);
}
