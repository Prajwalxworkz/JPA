package com.xworkz.hotel.persistrunner;

import com.xworkz.hotel.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HotelRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("hotel");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(new Hotel5(7,"Adyar Ananda Bhavan Sweets & A2B Veg","Lal bagh", 4.1,"Rs 200-400","delicious ","13k"));
        entityTransaction.commit();
    }
}
