package com.bootcamp.aulaspringlayers.controller;

import com.bootcamp.aulaspringlayers.exception.VehicleNotFoundException;
import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.bootcamp.aulaspringlayers.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired // injecao de dependencia - springboot vai gerar o objeto para mim
    private VehicleService service;

    @GetMapping("/{licensePlate}")
    public ResponseEntity<Vehicle> getVehicle(@PathVariable String licensePlate) {
        VehicleNotFoundException vehicle = service.getVehicle(licensePlate);

        if(vehicle != null) {
            return new ResponseEntity<>(vehicle, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping()
    public ResponseEntity<String> getMessageTest() {
        return new ResponseEntity<>("Deu certo", HttpStatus.OK);
    }
}
