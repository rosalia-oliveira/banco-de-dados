package com.bootcamp.aulaspringlayers.model;

import com.bootcamp.aulaspringlayers.service.IVehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String licensePlate;
    private String model;
    private Integer year;
    private Integer price;
    private int owner_id;
}
