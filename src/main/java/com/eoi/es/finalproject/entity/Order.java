package com.eoi.es.finalproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Compra")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private int id;

    @Column
    private Integer precio;

    @Column
    private Integer cantidadDeProductos;

    @Column
    private String vendedor;

    public Order(int id, Integer precio, Integer cantidadDeProductos) {
        super();
        this.id = id;

        this.precio = precio;
        this.cantidadDeProductos = cantidadDeProductos;
    }

}