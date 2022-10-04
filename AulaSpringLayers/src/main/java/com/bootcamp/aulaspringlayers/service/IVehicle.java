package com.bootcamp.aulaspringlayers.service;

import com.bootcamp.aulaspringlayers.model.Vehicle;

import java.util.List;

public interface IVehicle {
    Object getVehicle(String placa);
    List<Vehicle> getAllVehicle();
    List<Vehicle> getVehiclesOrderByValue();
}

