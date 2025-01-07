package com.xworkz.resort.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ResortRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("xworkz");
    }
}
