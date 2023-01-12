package com.hotel.SpringbootMySQL.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {
   @Id
   private Integer hotelId;
   private String hotelName; 
}
