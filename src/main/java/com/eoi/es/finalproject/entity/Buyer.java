package com.eoi.es.finalproject.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Compradores")
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String nombre;

    @Column
    private Integer edad;

    @Column
    private Integer numeroDeCompras;

    public Buyer(int id, String nombre, Integer edad, Integer numeroDeCompras) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeCompras = numeroDeCompras;
    }

}
