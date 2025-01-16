package com.xworkz.cars.runner;

import com.xworkz.cars.entity.CarEntity;
import com.xworkz.cars.service.CarService;
import com.xworkz.cars.service.CarServiceImpl;
import sun.util.resources.cldr.ee.CalendarData_ee_GH;

public class CarFindRunner {
    public static void main(String[] args) {
        CarService service=new CarServiceImpl();
        CarEntity carEntity=service.getCarById(1);
        System.out.println(carEntity);
        CarEntity carEntity1=service.getCarByCategory("SUV");
        System.out.println(carEntity1);
    }
}
