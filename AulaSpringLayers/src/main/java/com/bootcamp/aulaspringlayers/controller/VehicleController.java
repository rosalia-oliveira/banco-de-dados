package com.bootcamp.aulaspringlayers.controller;

import com.bootcamp.aulaspringlayers.exception.NotFoundException;
import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.bootcamp.aulaspringlayers.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired // injecao de dependencia - springboot vai gerar o objeto para mim
    private VehicleService service;

    @GetMapping("/{licensePlate}")
    public ResponseEntity<Vehicle> getVehicle(@PathVariable String licensePlate) {
        Vehicle vehicle = service.getVehicle(licensePlate);
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return new ResponseEntity<>(service.getAllVehicle(), HttpStatus.OK);
    }

    @GetMapping("/order")
    public ResponseEntity<List<Vehicle>> getVehiclesOrderByValue() {
        return new ResponseEntity<>(service.getVehiclesOrderByValue(), HttpStatus.OK);
    }
}


// -Dcom.sun.management.jmxremote.local.only=false
