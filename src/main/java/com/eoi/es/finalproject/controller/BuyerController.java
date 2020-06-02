package com.eoi.es.finalproject.controller;


import com.eoi.es.finalproject.entity.Buyer;
import com.eoi.es.finalproject.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerservice;


    @GetMapping("/buyer")
    public List<Buyer> getAll() {
        return buyerservice.getAll();
    }

    @GetMapping("/buyer/{id}")

    public Buyer getBuyerById(@PathVariable String id) {
        return buyerservice.getBuyerById(Integer.parseInt(id));

    }

    @DeleteMapping("/buyer/{id}")

    public void deleteBuyer(@PathVariable String id) {
        buyerservice.deleteBuyer(Integer.parseInt(id));

    }

    @PostMapping("/buyer")
    public Buyer createBuyer(@RequestBody Buyer buyer) {

        return buyerservice.createBuyer(buyer);

    }

    @PutMapping("/buyer/{id}")
    public Buyer updateBuyer(@PathVariable int id, @RequestBody Buyer buyer) {

//        Buyer updatebuyer = buyerservice.getBuyerById(id)
//                .map(buyer1 -> {
//                    buyer1.setNombre(buyer.getNombre());
//                    buyer1.setEdad(buyer.getEdad());
//                    buyer1.setnumeroDeCompras(buyer.getNumeroDeCompras());
//                    
//                    return this.buyerservice.save(buyer);
//                    
//
//        });




        return buyerservice.updateBuyer(buyer);

    }
}
