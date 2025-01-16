package com.xworkz.cars.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="car")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NamedNativeQuery(name = "getByCategory",query = "select * from car where category=:category",resultClass = CarEntity.class)
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int carId;
    private String model;
    private String category;
    @Column(name = "fuel")
    private String fuelVariant;
    @Column(name = "transmission")
    private String transmissionVariant;
    @Column(name="price")
    private double basePrice;

}
