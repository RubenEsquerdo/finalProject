package com.eoi.es.finalproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "Compradores")
public class Buyer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Buyer_id", unique = true)
	private int id;

	@Column
	private String nombre;

	@Column
	private Integer edad;

	@Column
	private Integer numeroDeCompras;

	@OneToMany(fetch = FetchType.LAZY)
	List<Order> orders;

}
