package org.childrenshop.service.impl;

import org.childrenshop.model.Toy;
import org.childrenshop.repository.Toys;
import org.childrenshop.repository.impl.ToysImpl;
import org.childrenshop.service.ToyService;

import java.util.HashSet;
import java.util.Optional;

public class ToyServiceImpl implements ToyService {
    private static Toys toys = ToysImpl.getInstance();
    @Override
    public int add(Toy toy) {
        return toys.add(toy);
    }

    @Override
    public Optional<Toy> findById(int id) {
        return Optional.empty();
    }

    @Override
    public HashSet<Toy> findAll() {
        return null;
    }

    @Override
    public void delete(Toy toy) {

    }
}
