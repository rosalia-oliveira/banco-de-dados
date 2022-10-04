package com.bootcamp.pratica3javaiii.service;

import com.bootcamp.pratica3javaiii.model.Vehicle;

import java.io.IOException;
import java.util.List;

public interface IVehicle {
    void create(Vehicle vehicle);
    List<Vehicle> getAll() throws IOException;
    List<Vehicle> getAllWithoutService() throws IOException;
    List<Vehicle> getByManufacturingDate(String date) throws IOException;
    List<Vehicle> getByPrice(String price) throws IOException;
}
