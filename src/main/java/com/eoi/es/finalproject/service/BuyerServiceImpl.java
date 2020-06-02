package com.eoi.es.finalproject.service;

import com.eoi.es.finalproject.entity.Buyer;
import com.eoi.es.finalproject.repository.BuyerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

	@Autowired(required = true)
	BuyerRepository buyerRepository;

	@Override
	public List<Buyer> getAll() {
		return this.buyerRepository.findAll();
	}

	@Override
	public Buyer getBuyerById(int id) {

		return this.buyerRepository.findById(id).get();
	}

	@Override
	public void deleteBuyer(int id) {
		this.buyerRepository.deleteById(id);

	}

	@Override
	public Buyer createBuyer(Buyer buyer) {

		return this.buyerRepository.save(buyer);
	}

	@Override
	public Buyer updateBuyer(Buyer buyer) {
		return this.buyerRepository.save(buyer);
	}


}
