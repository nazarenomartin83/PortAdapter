package com.example.PortAdapter.application.mapper;

public interface IEntityDtoMapper <E,D> {
    E dtoToEntity(D dto);
    D entityToDto(E entity);
}
