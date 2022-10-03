package com.bootcamp.aulaspringlayers.service;

import com.bootcamp.aulaspringlayers.exception.VehicleNotFoundException;
import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.bootcamp.aulaspringlayers.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicle{
    @Autowired
    private VehicleRepository repo;

    @Override
    public VehicleNotFoundException getVehicle(String licensePlate) {
        Optional<Vehicle> vehicle = repo.getVehicle(licensePlate);
        if(vehicle.isEmpty()) {
            return new VehicleNotFoundException("Veiculo nao encontrado");
        }
        return vehicle.get();
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return null;
    }

    @Override
    public String getMessageTest() {
        return null;
    }
}
