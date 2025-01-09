package com.xworkz.hotel.updaterunner;

import com.xworkz.hotel.entity.Hotel3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel3MergeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hotel");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        try {
            Hotel3 hotel3 = em.find(Hotel3.class, 1);
            if (hotel3 != null) {
                transaction.begin();
                hotel3.setAverageCost(700.0);
                em.merge(hotel3);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel3 hotel3 = em.find(Hotel3.class, 2);
            if (hotel3 != null) {
                transaction.begin();
                hotel3.setRatings(4.5);
                em.merge(hotel3);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel3 hotel3 = em.find(Hotel3.class, 4);
            if (hotel3 != null) {
                transaction.begin();
                hotel3.setReview("very spicy");
                em.merge(hotel3);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel3 hotel3 = em.find(Hotel3.class, 7);
            if (hotel3 != null) {
                transaction.begin();
                hotel3.setHotelType("Non-veg");
                em.merge(hotel3);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel3 hotel3 = em.find(Hotel3.class, 6);
            if (hotel3 != null) {
                transaction.begin();
                hotel3.setLocation("MG road");
                em.merge(hotel3);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
