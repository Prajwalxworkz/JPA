package com.xworkz.cars.repository;

import com.xworkz.cars.entity.CarEntity;

import javax.persistence.*;

public class CarRepositoryImpl implements CarRepository{
  private  EntityManagerFactory emf=Persistence.createEntityManagerFactory("cars");
    @Override
    public boolean save(CarEntity carEntity) throws Exception {
        boolean isAdded=false;
       EntityManager em= emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
           transaction.begin();
           em.persist(carEntity);
           isAdded=true;
           transaction.commit();
           em.close();
           if(isAdded==false) {
               throw new Exception();
           }
           return isAdded;
    }

    @Override
    public CarEntity getCarById(int id) {
       EntityManager em=emf.createEntityManager();
       return em.find(CarEntity.class,id);

    }

    @Override
    public CarEntity getCarByCategory(String category) {
        EntityManager em= emf.createEntityManager();
        Query query=em.createNamedQuery("getByCategory");
        query.setParameter("category",category);
        try {
            CarEntity carEntity = (CarEntity) query.getSingleResult();
            return carEntity;
        }catch (NoResultException e)
        {
            System.out.println(e.getMessage());
        }
       return null;
    }

    @Override
    public CarEntity updateCarById(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        CarEntity carEntity1=em.find(CarEntity.class,id);
        try {
            if (carEntity1 != null) {
                transaction.begin();
                carEntity1.setCategory("premium hatchback");
                CarEntity carEntity2 = em.merge(carEntity1);
                transaction.commit();
                return carEntity2;
            }
        }catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }
        return null;
    }
}
