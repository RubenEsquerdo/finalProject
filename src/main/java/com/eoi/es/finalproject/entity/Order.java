package com.eoi.es.finalproject.entity;

import lombok.*;

import javax.persistence.*;

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Buyer_id", referencedColumnName = "Buyer_id")
	public Buyer buyer;
}