package com.xworkz.decathlonapp.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DecathlonAppRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("decathlon");
    }
}
