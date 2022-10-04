package com.bootcamp.pratica3javaiii.service;

import com.bootcamp.pratica3javaiii.model.Vehicle;
import com.bootcamp.pratica3javaiii.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class VehicleService implements IVehicle {

    @Autowired
    private VehicleRepository repo;

    @Override
    public void create(Vehicle vehicle) {
        repo.create(vehicle);
    }

    @Override
    public List<Vehicle> getAll() {
        return repo.getAll();
    }

    @Override
    public List<Vehicle> getAllWithoutService() {
       return repo.getAllWithoutService();
    }

    @Override
    public List<Vehicle> getByManufacturingDate(String date)  {
        return repo.getByManufacturingDate(date);
    }

    @Override
    public List<Vehicle> getByPrice(String price) {
        return repo.getByPrice(price);
    }
}
