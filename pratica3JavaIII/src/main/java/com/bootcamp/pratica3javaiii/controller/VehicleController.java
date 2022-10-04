package com.bootcamp.pratica3javaiii.controller;

import com.bootcamp.pratica3javaiii.model.Vehicle;
import com.bootcamp.pratica3javaiii.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/veiculos")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping()
    public ResponseEntity<List<Vehicle>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/services")
    public ResponseEntity<List<Vehicle>> getAllWithoutService() {
        return new ResponseEntity<>(service.getAllWithoutService(), HttpStatus.OK);
    }

    @GetMapping("date")
    public ResponseEntity<List<Vehicle>> getByManufacturingDate(@RequestParam String dates) {
        return new ResponseEntity<>(service.getByManufacturingDate(dates), HttpStatus.OK);
    }

    @GetMapping("/prices")
    public ResponseEntity<List<Vehicle>> getByPrice(@RequestParam String prices) {
        return new ResponseEntity<>(service.getByPrice(prices), HttpStatus.OK);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Vehicle vehicle) {
        service.create(vehicle);
    }
}
