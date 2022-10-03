package com.bootcamp.pratica1javaiii.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Symptom {
    private String code;
    private String name;
    private int gravityLevel;
}
