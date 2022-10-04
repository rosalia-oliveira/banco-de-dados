package com.bootcamp.aulaspringlayers.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    private int id;
    private String name;
    private String phone;
    private List<Vehicle> vehicles;

    public void setVehicleInList(Vehicle vehicle) {
        if(vehicles == null) {
            vehicles = new ArrayList<>();
        }
        vehicles.add(vehicle);
    }
}
