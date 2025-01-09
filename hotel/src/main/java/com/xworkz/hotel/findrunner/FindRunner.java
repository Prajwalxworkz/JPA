package com.xworkz.hotel.findrunner;

import com.xworkz.hotel.entity.Hotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("hotel");
        EntityManager em=emf.createEntityManager();
        Hotel hotel=em.find(Hotel.class,1);
        System.out.println(hotel);
    }
}
