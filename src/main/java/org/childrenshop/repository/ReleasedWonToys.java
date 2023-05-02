package org.childrenshop.repository;

import java.util.Optional;

public interface ReleasedWonToys <T> {
    int add(T entity);
    Optional<T> findById(int id);
    void delete(T entity);
}
