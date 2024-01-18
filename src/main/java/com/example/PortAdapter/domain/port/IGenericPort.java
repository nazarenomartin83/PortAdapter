package com.example.PortAdapter.domain.port;

import java.util.List;
import java.util.Optional;

public interface IGenericPort <T> {
    T create(T entity);
    Optional<T> getById(Long id);
    List<T> getAll();
    void deleteById(Long id);
    T update(T entity);
}
