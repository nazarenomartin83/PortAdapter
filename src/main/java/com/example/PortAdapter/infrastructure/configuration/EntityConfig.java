package com.example.PortAdapter.infrastructure.configuration;

import com.example.PortAdapter.infrastructure.adapter.dto.mapper.CompanyDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityConfig {
    // El servicio "CompanyDtoMapper" puede ser anotado como @Service o puede
    // se anotado como un beans desde la configuración de la capa de infrastructure (ya que es el unico que lo utiliza).
    // Es útil para marcar como "Bean" el dominio, evitando anotaciones en la capa de dominio para desacoplarlo de Spring.
    @Bean
    public CompanyDtoMapper createCompanyMapper(){
        return new CompanyDtoMapper();
    }
}
