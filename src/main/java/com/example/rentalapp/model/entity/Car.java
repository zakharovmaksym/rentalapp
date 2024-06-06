package com.example.rentalapp.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Year;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
@Table (name = "Cars")
public class Car {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
//     private Division division;
     private String model;
     private String brand;
     private String body_type;
     private String color;
     private int mileage;
     private String registrationNumber;
     private boolean available;
     private Year productionYear;
     private BigDecimal cost_per_day;
}
