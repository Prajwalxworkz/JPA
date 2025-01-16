package com.xworkz.cars.runner;

import com.xworkz.cars.entity.CarEntity;
import com.xworkz.cars.service.CarService;
import com.xworkz.cars.service.CarServiceImpl;

public class CarPersistRunner {
    public static void main(String[] args) {
        CarService service=new CarServiceImpl();
        boolean isAdded=service.save(new CarEntity(0,"Punch","sub-compact SUV", "Petrol", "Manual",619990.0));
        System.out.println("Is car added: "+isAdded);
    }
}
