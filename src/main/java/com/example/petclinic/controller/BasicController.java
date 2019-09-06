package com.example.petclinic.controller;

import java.util.List;

// generic interface
public interface BasicController<T> {  // T is var declaration

    T add(T t);
    T get(Long t);
    T modify(T t);
    boolean delete(T t);
    List<T> getAll();

}
