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
@Table(name="Hotel2")
public class Hotel2 {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="h_name")
    private String hotelName;
    @Column(name="location")
    private String location;
    @Column(name="review")
    private String review;
    @Column(name="ratings")
    private Double ratings;
    @Column(name="type")
    private String hotelType;
    @Column(name="ph_no")
    private Long phoneNumber;
}
