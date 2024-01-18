package com.example.PortAdapter.domain.model.port;

import java.util.List;
public interface IGenericPort <T> {
    T create(T entity);
    T getById(Long id);
    List<T> getAll();
    void deleteById(Long id);
    T update(T user);
}
