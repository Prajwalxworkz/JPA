package com.xworkz.cars.runner;

import com.xworkz.cars.entity.CarEntity;
import com.xworkz.cars.service.CarService;
import com.xworkz.cars.service.CarServiceImpl;

public class CarMergeRunner {
    public static void main(String[] args) {
        CarService service= new CarServiceImpl();
        CarEntity carEntity=service.updateCarById(3);
        System.out.println(carEntity);
    }
}
