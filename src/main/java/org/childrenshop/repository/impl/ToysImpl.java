package org.childrenshop.repository.impl;

import org.childrenshop.config.AppConfig;
import org.childrenshop.model.Toy;
import org.childrenshop.repository.Toys;
import org.childrenshop.utils.FileUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

public class ToysImpl implements Toys {
    private static HashSet<Toy> toys = initCollection();

    private static ToysImpl instance;

    private ToysImpl(){}

    public static ToysImpl getInstance() {
        if (instance == null) {
            instance = new ToysImpl();
        }
        return instance;
    }

    @Override
    public int add(Object entity) {
        this.toys.add((Toy) entity);
        FileUtils.writeFile("\n" + ((Toy) entity).toString(), AppConfig.getProperty("file.toys"), true);
        return ((Toy) entity).id();
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

    private static HashSet<Toy> initCollection() {
        HashSet<Toy> toys = new HashSet<>();
        ArrayList<String> data = FileUtils.readFile(AppConfig.getProperty("file.toys"));

        for (String line: data) {
            String[] values = line.split(COMMA_DELIMITER);
            int personId = Integer.parseInt(values[0]);
            String note = values[1];
            toys.add(new Toy(personId, note));
        }

        return toys;
    }
}
