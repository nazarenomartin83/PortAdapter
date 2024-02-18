package com.example.PortAdapter.infrastructure.adapter.dto;

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
    private String nick;
    public String getNick()
    {
        return this.name+" / "+this.address;
    }
}
