package com.xworkz.hotel.updaterunner;

import com.xworkz.hotel.entity.Hotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hotel1MergeRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotel");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            Hotel hotel = em.find(Hotel.class, 1);
            hotel.setHotelName("Brahmins Cafe");
            transaction.begin();
            em.merge(hotel);
            transaction.commit();
            em.close();
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel hotel = em.find(Hotel.class, 2);
            if (hotel!=null) {
                hotel.setPincode(545466);
                transaction.begin();
                em.merge(hotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel hotel = em.find(Hotel.class, 3);
            if (hotel!=null) {
                hotel.setLocation("Magadi road");
                transaction.begin();
                em.merge(hotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel hotel = em.find(Hotel.class, 4);
            if (hotel!=null) {
                hotel.setRatings(4.6);
                transaction.begin();
                em.merge(hotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

        try {
            Hotel hotel = em.find(Hotel.class, 8);
            if (hotel!=null) {
                hotel.setHotelName("Canara Cafe");
                transaction.begin();
                em.merge(hotel);
                transaction.commit();
                em.close();
            }else System.out.println("data not found");
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }

    }
}
