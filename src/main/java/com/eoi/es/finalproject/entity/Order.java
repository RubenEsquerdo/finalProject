package com.eoi.es.finalproject.entity;

import javax.persistence.*;

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
	private Integer id;

	@Column
	private Integer precio;

	@Column
	private Integer cantidadDeProductos;

	@Column
	private String vendedor;
	
	@ManyToOne
	@JoinColumn(name = "Buyer_id", referencedColumnName = "Buyer_id")
	public Buyer buyer;
}