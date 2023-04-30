package org.childrenshop.repository.impl;

import org.childrenshop.repository.Stock;

import java.util.HashSet;
import java.util.Optional;

public class StockImpl implements Stock {

    @Override
    public int add(Object entity) {
        return 0;
    }

    @Override
    public Optional findById(int id) {
        return Optional.empty();
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public HashSet findAll() {
        return null;
    }
}
