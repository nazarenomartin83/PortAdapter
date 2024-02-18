package com.example.PortAdapter.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Company {
    private Long id;
    private String name;
    private String address;
    private Instant createTime;

    public void setCreateTime()
    {
        this.createTime = Instant.now();
    }
}
