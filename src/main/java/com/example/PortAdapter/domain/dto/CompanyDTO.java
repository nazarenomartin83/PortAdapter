package com.example.PortAdapter.domain.dto;

import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
public class CompanyDTO {
    @Id
    private Long id;
    private String name;
    private String address;
    @Getter(AccessLevel.NONE)
    private String value;
    private String getValue()
    {
        return this.name+" / "+this.address;
    }
}
