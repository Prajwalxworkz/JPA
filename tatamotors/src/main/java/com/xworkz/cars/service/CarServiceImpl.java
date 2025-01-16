package com.xworkz.cars.service;

import com.xworkz.cars.entity.CarEntity;
import com.xworkz.cars.repository.CarRepository;
import com.xworkz.cars.repository.CarRepositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarServiceImpl implements CarService{
    CarRepository repository=new CarRepositoryImpl();
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("cars");

    @Override
    public boolean save(CarEntity carEntity) {
        EntityManager em= emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        try{
            return repository.save(carEntity);
        }catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public CarEntity getCarById(int id) {
       return repository.getCarById(id);

    }

    @Override
    public CarEntity getCarByCategory(String category) {
       return repository.getCarByCategory(category);

    }

    @Override
    public CarEntity updateCarById(int id) {
       return repository.updateCarById(id);
    }
}
