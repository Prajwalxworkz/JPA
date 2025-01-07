package com.xworkz.laptops.runner;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LaptopRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("laptops");
    }
}
