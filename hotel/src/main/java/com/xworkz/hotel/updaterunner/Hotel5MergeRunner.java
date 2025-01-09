package com.xworkz.hotel.updaterunner;

import com.xworkz.hotel.entity.Hotel5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel5MergeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hotel");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction=em.getTransaction();
        try {
            Hotel5 hotel5 = em.find(Hotel5.class, 1);
            if (hotel5 != null) {
                transaction.begin();
                hotel5.setLocation("Jayanagar");
                em.merge(hotel5);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel5 hotel5 = em.find(Hotel5.class, 2);
            if (hotel5 != null) {
                transaction.begin();
                hotel5.setReview("vibes good");
                hotel5.setReviewCount("4k");
                em.merge(hotel5);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel5 hotel5 = em.find(Hotel5.class, 3);
            if (hotel5 != null) {
                transaction.begin();
                hotel5.setHotelName("Brahmins cafe");
                hotel5.setLocation("Jayanagar");
                em.merge(hotel5);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel5 hotel5 = em.find(Hotel5.class, 4);
            if (hotel5 != null) {
                transaction.begin();
                hotel5.setAverageCost("Rs 600");
                em.merge(hotel5);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel5 hotel5 = em.find(Hotel5.class, 5);
            if (hotel5 != null) {
                transaction.begin();
                hotel5.setRatings(4.3);
                hotel5.setLocation("JP nagar");
                em.merge(hotel5);
                transaction.commit();
            } else System.out.println("Data not found");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
