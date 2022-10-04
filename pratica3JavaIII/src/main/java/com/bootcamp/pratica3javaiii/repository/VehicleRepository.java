package com.bootcamp.pratica3javaiii.repository;

import com.bootcamp.pratica3javaiii.model.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VehicleRepository {
    private final String vehicleRepo = "src/main/resources/vehicles.json";
    ObjectMapper mapper = new ObjectMapper();

    public void create(Vehicle vehicle) {

    }

    public List<Vehicle> getAll() {
        List<Vehicle> allVehicles;
        try {
            allVehicles = Arrays.asList(mapper.readValue(new File(vehicleRepo), Vehicle[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allVehicles;
    }

    public List<Vehicle> getAllWithoutService() {
        List<Vehicle> allVehicles = new ArrayList<>(this.getAll());
        return allVehicles;
    }

    public List<Vehicle> getByManufacturingDate(String date) {
        List<Vehicle> allVehicles = new ArrayList<>(this.getAll());
        allVehicles.stream()
                .filter(vehicle -> vehicle.getManufacturingDate().equals(date));
        return allVehicles;
    }

    public List<Vehicle> getByPrice(String price) {
        List<Vehicle> allVehicles = new ArrayList<>(this.getAll());
        allVehicles.stream()
                .filter(vehicle -> vehicle.getManufacturingDate().equals(price));
        return allVehicles;
    }
}
