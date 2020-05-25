package com.eoi.es.finalproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Productos")
@Getter
@Setter
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String name;

    @Column
    private String description;

    @Column
    private Integer precio;

    @Column
    private int calificacion;

    @Column
    private Integer cantidad;

    @Column
    private String categoria;

    @Column
    private Boolean disponible;
}
