package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.nuriaprueba;
import com.eoi.es.finalproject.repository.nuriapruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class nuriapruebaServiceImpl implements nuriapruebaService{

    @Autowired
    nuriapruebaRepository repository;



    @Override
    public List<nuriaprueba> getAll() {
        return this.repository.findAll();
    }



}
