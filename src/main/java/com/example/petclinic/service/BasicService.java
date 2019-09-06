package com.example.petclinic.service;

import java.util.List;

// generic interface
public interface BasicService<T> {  // T is var declaration

    T add(T t);
    T get(Long t);
    T modify(T t);
    boolean delete(T t);
    List<T> getAll();

}
