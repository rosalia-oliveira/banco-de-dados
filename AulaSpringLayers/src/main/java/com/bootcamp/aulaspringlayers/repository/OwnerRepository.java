package com.bootcamp.aulaspringlayers.repository;

import com.bootcamp.aulaspringlayers.model.Owner;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class OwnerRepository {
    private String ownerRepo = "src/main/resources/owners.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<Owner> getAll() {
        try {
           return Arrays.asList(mapper.readValue(new File(ownerRepo), Owner[].class));

        } catch(Exception exc){
            System.out.println("");
        }
        return null;
    }
}
