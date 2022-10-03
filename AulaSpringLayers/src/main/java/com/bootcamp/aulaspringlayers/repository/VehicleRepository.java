package com.bootcamp.aulaspringlayers.repository;

import com.bootcamp.aulaspringlayers.model.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepository {
    private final String repositoryFile = "src/main/resources/vehiccles.json";
    ObjectMapper mapper = new ObjectMapper();

//    public Vehicle getVehicle(String licensePlate) {
//        List<Vehicle> listVehicles = null;
////        para ler um arquivo precisamos indicar new File(file)
////        ObjectMapper = ver o que e;
//        try {
//            listVehicles = Arrays.asList(mapper.readValue(new File(repositoryFile), Vehicle[].class));
//        } catch (Exception exc) {
//
//        }
//        for( Vehicle v: listVehicles) {
//            if(v.getLicensePlate().equals(licensePlate)) {
//                return v;
//            }
//        }
//        return null;
//    }

        public Optional<Vehicle> getVehicle(String licensePlate) {
        List<Vehicle> listVehicles = null;
//        para ler um arquivo precisamos indicar new File(file)
//        ObjectMapper = ver o que e;
        try {
            listVehicles = Arrays.asList(mapper.readValue(new File(repositoryFile), Vehicle[].class));
        } catch (Exception exc) {

        }
        for( Vehicle v: listVehicles) {
            if(v.getLicensePlate().equals(licensePlate)) {
                return Optional.of(v);
            }
        }
        return Optional.empty();
    }

}
