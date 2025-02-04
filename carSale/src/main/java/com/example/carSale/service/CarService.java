package com.example.carSale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carSale.entity.CarEntity;
import com.example.carSale.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	CarRepository carRepository;
	
	public List<CarEntity> findAllCars() {
	    return carRepository.findAll();
	}

	public Optional<CarEntity> findByIdCars(Integer id) {
	    return carRepository.findById(id);
	}

	public void saveCar(CarEntity carEntity) {
	    carRepository.save(carEntity);
	}

}
