package com.bootcamp.aulaspringlayers.dto;

import com.bootcamp.aulaspringlayers.model.Vehicle;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class VehicleDTO implements Serializable {
    private String licensePlate;
    private String model;

    public VehicleDTO(Vehicle vehicle) {
        this.licensePlate = vehicle.getLicensePlate();
        this.model = vehicle.getModel();
    }
}
