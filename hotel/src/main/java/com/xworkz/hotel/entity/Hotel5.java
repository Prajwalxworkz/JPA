package com.xworkz.hotel.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Hotel5")
public class Hotel5 {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="h_name")
    private String hotelName;
    @Column(name="location")
    private String location;
    @Column(name="ratings")
    private Double ratings;
    @Column(name="avg_cost")
    private String averageCost;
    @Column(name="review")
    private String review;
    @Column(name="r_count")
    private String reviewCount;
}
