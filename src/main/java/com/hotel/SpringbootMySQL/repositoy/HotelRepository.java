package com.hotel.SpringbootMySQL.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.SpringbootMySQL.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
