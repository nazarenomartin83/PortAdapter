package com.example.PortAdapter.infrastructure.adapter.repository.mapper;

import com.example.PortAdapter.infrastructure.adapter.repository.entity.Company;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.annotation.Reference;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CompanyDbEntityMapper {
    // https://www.baeldung.com/mapstruct
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "createTime", target = "create")
    Company toDbo(com.example.PortAdapter.domain.entity.Company domain);

    @InheritInverseConfiguration
    @Reference
    default com.example.PortAdapter.domain.entity.Company toDomain(Optional<Company> entity) {
        return (entity != null && entity.isPresent()) ? toDomain(entity.get()) : null;
    }

    @InheritInverseConfiguration
    com.example.PortAdapter.domain.entity.Company toDomain(Company entity);
}
