package com.desafio.agendamentos.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String licensePlate;

    private String model;

    private String manufacturer;

    private Integer vehicleYear;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}