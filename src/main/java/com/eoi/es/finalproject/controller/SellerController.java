package com.eoi.es.finalproject.controller;


import com.eoi.es.finalproject.entity.Seller;
import com.eoi.es.finalproject.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins = "http://localhost:4200")
@RestController
public class SellerController {


    @Autowired
    private SellerService sellerService;


    @GetMapping("/seller")
    public List<Seller> getAllSeller() {
        return sellerService.getAllSeller();
    }

    @GetMapping("/seller/{id}")
    public Seller getSellerByID(@PathVariable String id){
        return sellerService.getSellerByID(Integer.parseInt(id));
    }

    @DeleteMapping("/seller/{id}")
    public void deleteSeller(@PathVariable String id){
         sellerService.deleteSeller(Integer.parseInt(id));
    }

    @PutMapping("/seller/{id}")
    public Seller updateSeller(@RequestBody Seller seller, @PathVariable String id)
    {
        Seller seller1 = sellerService.getSellerByID(Integer.parseInt(id));
        seller1.setNombre(seller.getNombre());
        return sellerService.updateSeller(seller);
    }
}
