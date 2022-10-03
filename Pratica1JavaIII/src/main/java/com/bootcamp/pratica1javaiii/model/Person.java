package com.bootcamp.pratica1javaiii.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private String lastName;
    private int age;
}
