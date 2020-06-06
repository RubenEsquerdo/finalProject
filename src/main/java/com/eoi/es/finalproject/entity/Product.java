package com.eoi.es.finalproject.entity;


import lombok.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

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
    
    @ManyToOne
	@JoinColumn(name = "id_vendedores")
	public Seller seller;


}
