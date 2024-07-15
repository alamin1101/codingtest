package com.bracit.codingtest.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Battery {
    private Long id;
    private String name;
    private Integer wattCapacity;
    private Integer postCode;
}
