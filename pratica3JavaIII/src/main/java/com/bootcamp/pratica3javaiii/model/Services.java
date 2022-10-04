package com.bootcamp.pratica3javaiii.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Services {
    private String date;
    private String kilometers;
    private String descriptions;
}
