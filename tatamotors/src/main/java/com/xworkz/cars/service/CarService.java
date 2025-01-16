package com.xworkz.cars.service;

import com.xworkz.cars.entity.CarEntity;

public interface CarService {
    boolean save(CarEntity carEntity);
    CarEntity getCarById(int id);
    CarEntity getCarByCategory(String category);
    CarEntity updateCarById(int id);
}
