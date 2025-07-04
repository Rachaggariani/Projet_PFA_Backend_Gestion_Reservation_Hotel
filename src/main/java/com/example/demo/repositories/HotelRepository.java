package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
    List<Hotel> findByNomHotelContainingIgnoreCase(String nom);
    boolean existsById(Long id);

}
