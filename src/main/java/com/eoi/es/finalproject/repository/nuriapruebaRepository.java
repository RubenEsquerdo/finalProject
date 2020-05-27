package com.eoi.es.finalproject.repository;

import com.eoi.es.finalproject.entity.nuriaprueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface nuriapruebaRepository extends JpaRepository <nuriaprueba, Integer> {
}
