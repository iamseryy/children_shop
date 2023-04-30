package org.childrenshop.repository;

import java.util.HashSet;
import java.util.Optional;

public interface Toys <T> {
    String COMMA_DELIMITER = ";";
    int add(T entity);
    Optional<T> findById(int id);
    void delete(T entity);
    HashSet<T> findAll();
}