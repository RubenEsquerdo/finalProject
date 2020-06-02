package com.eoi.es.finalproject.repository;

import com.eoi.es.finalproject.entity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BuyerRepository extends JpaRepository <Buyer , Integer> {
}
