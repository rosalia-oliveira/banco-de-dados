package com.bootcamp.aulaspringlayers.service;

import com.bootcamp.aulaspringlayers.exception.NotFoundException;
import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.bootcamp.aulaspringlayers.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService implements IVehicle{
    @Autowired
    private VehicleRepository repo;

    @Override
    public Vehicle getVehicle(String licensePlate) {
        Optional<Vehicle> vehicle = repo.getVehicle(licensePlate);
        if(vehicle.isEmpty()) {
            throw  new NotFoundException("Veiculo nao encontrado");
        }
        return vehicle.get();
    }

    @Override
    public List<Vehicle> getAllVehicle() {

        return repo.getAllVehicle();
    }

    @Override
    public List<Vehicle> getVehiclesOrderByValue() {
        List<Vehicle> vehiclesOrdenated = repo.getAllVehicle();
       return vehiclesOrdenated.stream()
               .sorted((a, b) -> a.getYear().compareTo(b.getYear()))
               .collect(Collectors.toList());
    }
}
