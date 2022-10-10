package com.testes.testes.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class UserDTO {

    @NotBlank(message = "The name field is required.")
    private String name;

    @NotBlank(message = "The email field is required")
    @Email(message = "invalid email format")
    private String email;

    @Min(value = 18)
    private int age;
}
