package com.xworkz.hotel.updaterunner;

import com.xworkz.hotel.entity.Hotel2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel2MergeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            Hotel2 hotel = em.find(Hotel2.class, 1);
            if (hotel != null) {
                hotel.setHotelName("Miltry hotel");
                transaction.begin();
                hotel.setHotelType("Veg & Non-Veg");
                em.merge(hotel);
                transaction.commit();
//                em.close();
            } else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try{
            Hotel2 hotel2=em.find(Hotel2.class,2);
            if(hotel2!=null){
                transaction.begin();
                hotel2.setReview("not good");
                hotel2.setLocation("Old madras road");
                em.merge(hotel2);
                transaction.commit();
//                em.close();
            }else System.out.println("Data not found");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Hotel2 hotel = em.find(Hotel2.class, 3);
            if (hotel != null) {
                transaction.begin();
                hotel.setLocation("Magadi ");
                em.merge(hotel);
                transaction.commit();
//                em.close();
            } else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel2 hotel = em.find(Hotel2.class, 10);
            if (hotel != null) {
                transaction.begin();
                hotel.setHotelName("Canara Cafe");
                em.merge(hotel);
                transaction.commit();
//                em.close();
            } else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel2 hotel = em.find(Hotel2.class, 4);
            if (hotel != null) {
                transaction.begin();
                hotel.setRatings(4.8);
                em.merge(hotel);
                transaction.commit();
//                em.close();
            } else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

    }
}
