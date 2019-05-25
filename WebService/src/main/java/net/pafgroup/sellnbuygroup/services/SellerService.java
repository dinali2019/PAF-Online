package net.pafgroup.sellnbuygroup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pafgroup.sellnbuygroup.models.Seller;
import net.pafgroup.sellnbuygroup.repos.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<Seller> listAll() {
		return sellerRepository.findAll();
	}
	
	public void save(Seller seller) {
		sellerRepository.save(seller);
	}
	
	public Seller get(Long id) {
		return sellerRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		sellerRepository.deleteById(id);
	}
	
}
