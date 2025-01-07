package com.xworkz.restaurant.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("xworkz");
    }
}
