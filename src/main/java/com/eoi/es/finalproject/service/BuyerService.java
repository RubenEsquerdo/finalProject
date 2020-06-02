package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Buyer;

import java.util.List;

public interface BuyerService {


    public List<Buyer> getAll();

    public Buyer getBuyerById(int id);

    public void deleteBuyer(int id);

    public Buyer createBuyer(Buyer buyer);

    public Buyer updateBuyer(Buyer buyer);
}
