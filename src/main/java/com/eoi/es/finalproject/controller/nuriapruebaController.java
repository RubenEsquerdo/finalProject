package com.eoi.es.finalproject.controller;

import com.eoi.es.finalproject.entity.nuriaprueba;
import com.eoi.es.finalproject.service.nuriapruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class nuriapruebaController {

    @Autowired
    nuriapruebaService nuriapruebaservice;

    @GetMapping ("/nuriaprueba")
    public List<nuriaprueba> getAll(){
        return nuriapruebaservice.getAll();

    }






    }



