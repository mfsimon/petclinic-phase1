package com.example.petclinic.repository;

import java.util.List;

// generic interface
public interface CrudRepository<T> {  // T is var declaration

    T create(T t);
    T read(T t);
    T update(T t);
    boolean delete(T t);
    List<T> getAll();

}
