package com.xworkz.cars.repository;

import com.xworkz.cars.entity.CarEntity;

public interface CarRepository {
    boolean save(CarEntity carEntity) throws Exception;

    CarEntity getCarById(int id);

    CarEntity getCarByCategory(String name);

    CarEntity updateCarById(int id);
}
