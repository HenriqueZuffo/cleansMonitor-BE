package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(precision = 9, scale = 6, nullable = false)
    @Getter
    @Setter
    private BigDecimal latitude;

    @Column(precision = 9, scale = 6, nullable = false)
    @Getter
    @Setter
    private BigDecimal longitude;
}
