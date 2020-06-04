package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Seller;

import java.util.List;

public interface SellerService {



    public List<Seller> getAllSeller();

    public Seller getSellerByID(int id);

    public Seller updateSeller( Seller seller);

    public void deleteSeller(int id);

}
