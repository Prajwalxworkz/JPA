package com.xworkz.smartphones.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MobilesRunner {
    public static void main(String[] args) {
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("phone");
    }
}
