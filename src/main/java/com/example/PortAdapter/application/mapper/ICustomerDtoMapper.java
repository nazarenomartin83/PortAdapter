package com.example.PortAdapter.application.mapper;

import com.example.PortAdapter.domain.model.dto.CustomerDTO;
import com.example.PortAdapter.domain.model.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class ICustomerDtoMapper implements IEntityDtoMapper<Customer, CustomerDTO> {
    @Override
    public Customer dtoToEntity(CustomerDTO dto) {
        return null;
    }

    @Override
    public CustomerDTO entityToDto(Customer Entity) {
        return null;
    }
}
