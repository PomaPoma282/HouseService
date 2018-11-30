package ru.itpark.service;

import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.HouseRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HouseService {
    private HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public void add(House house) {
        repository.add(house);
    }


    public List<House> getAll() {
        return repository.getAll();
    }

    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getAll();
        result.sort(comparator);
        return result;
    }

    public List<House> findAllByName(String nameDistrict) {
        List<House> result = new ArrayList<House>();

        nameDistrict = nameDistrict.toLowerCase();
        for (House house : repository.getAll()) {
            if (house.getNameDistrict().toLowerCase().contains(nameDistrict)) {
                result.add(house);
            }
        }

        result.sort(new PriceComparator());

        return result;
    }





}
