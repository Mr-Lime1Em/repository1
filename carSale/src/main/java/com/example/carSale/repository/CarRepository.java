package com.example.carSale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.carSale.entity.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
