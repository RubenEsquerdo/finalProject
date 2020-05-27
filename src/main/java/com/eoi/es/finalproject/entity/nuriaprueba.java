package com.eoi.es.finalproject.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table

public class  nuriaprueba {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private String hobbies;
    @Column
    private Integer height;
    @Column
    private Integer weight;




}
