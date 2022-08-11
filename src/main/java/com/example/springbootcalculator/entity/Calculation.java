package com.example.springbootcalculator.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Calculation {
    @GeneratedValue
    @Id
    private int id;
    private String operation;
}
