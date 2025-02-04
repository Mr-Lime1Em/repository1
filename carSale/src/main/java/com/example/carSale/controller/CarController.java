package com.example.carSale.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.carSale.entity.CarEntity;
import com.example.carSale.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/list")
    public List<CarEntity> findAll() {
        return carService.findAllCars();
    }

    @GetMapping("/{id}")
    public Optional<CarEntity> findById(@PathVariable Integer id) {
        return carService.findByIdCars(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody CarEntity carEntity) {
        carService.saveCar(carEntity);
    }
}