package com.xworkz.hotel.updaterunner;

import com.xworkz.hotel.entity.Hotel4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel4MergeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hotel");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        try {
            Hotel4 hotel4 = em.find(Hotel4.class, 1);
            if (hotel4 != null) {
                transaction.begin();
                hotel4.setReviewCount("36.5k");
                em.merge(hotel4);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel4 hotel4 = em.find(Hotel4.class, 2);
            if (hotel4 != null) {
                transaction.begin();
                hotel4.setLocation("Trinity");
                em.merge(hotel4);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel4 hotel4 = em.find(Hotel4.class, 3);
            if (hotel4 != null) {
                transaction.begin();
                hotel4.setReview("very good");
                em.merge(hotel4);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel4 hotel4 = em.find(Hotel4.class, 7);
            if (hotel4 != null) {
                transaction.begin();
                hotel4.setHotelType("Veg ");
                em.merge(hotel4);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel4 hotel4 = em.find(Hotel4.class, 6);
            if (hotel4 != null) {
                transaction.begin();
                hotel4.setHotelName("Versha");
                em.merge(hotel4);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
