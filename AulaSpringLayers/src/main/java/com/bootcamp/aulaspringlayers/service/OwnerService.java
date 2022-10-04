package com.bootcamp.aulaspringlayers.service;

import com.bootcamp.aulaspringlayers.model.Owner;
import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.bootcamp.aulaspringlayers.repository.OwnerRepository;
import com.bootcamp.aulaspringlayers.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OwnerService implements IOwner {

    @Autowired
    private VehicleRepository vehicleRepo;
    private OwnerRepository ownerRepo;

    @Override
    public List<Owner> getAll() {
        List<Vehicle> listVehicle = new ArrayList<>(vehicleRepo.getAllVehicle());
        List<Owner> listOwner = new ArrayList<>(ownerRepo.getAll());
        listOwner.stream()
                .forEach(owner -> {
                    listVehicle.forEach(vehicle -> {
                        if(vehicle.getOwner_id() == owner.getId()) {
                            System.out.println("Oi");
                        }
                    });
                });
        return listOwner;
    }
}
