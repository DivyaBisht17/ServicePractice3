package com.training.service3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private  int id;
    private String name;
    private  float marks;
    private  boolean  countryIndia;
    private  String email;
}

