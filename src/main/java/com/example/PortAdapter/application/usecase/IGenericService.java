package com.example.PortAdapter.application.usecase;

import java.util.List;

public interface IGenericService <T> {
    T create(T dto);
    T update(T dto);
    T getById(Long id);
    T delete(Long id);
    List<T> getAll();
}
