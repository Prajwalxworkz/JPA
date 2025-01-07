package com.xworkz.insurances.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsuranceRunner {
    public static void main(String[] args) {
      EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("insurance");
    }
}
