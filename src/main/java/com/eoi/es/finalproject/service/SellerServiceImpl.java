package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Seller;
import com.eoi.es.finalproject.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SellerServiceImpl implements SellerService {
   @Autowired
    SellerRepository sellerRepository;


    @Override
    public List<Seller> getAllSeller() {
        return sellerRepository.findAll();
    }

    @Override
    public Seller getSellerByID(int id) {
        return sellerRepository.findById(id).get();
    }

    @Override
    public Seller updateSeller(Seller seller) {


        return sellerRepository.save(seller);
    }

    @Override
    public void deleteSeller(int id) {
        sellerRepository.deleteById(id);
    }
}
