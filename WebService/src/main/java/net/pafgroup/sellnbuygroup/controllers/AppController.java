package net.pafgroup.sellnbuygroup.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.pafgroup.sellnbuygroup.models.Seller;
import net.pafgroup.sellnbuygroup.services.SellerService;

@RestController
public class AppController {
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(method = RequestMethod.GET, value="/sellers")
	public List<Seller> getSellers() {
		List<Seller> listSellers = sellerService.listAll();
		
		return listSellers;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/sellers")
	public Seller addSellers(@RequestBody Seller seller) {
		sellerService.save(seller);
		
		return seller;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/sellers/{id}")
	public Seller updateSeller(@PathVariable(name = "id") Long id, @RequestBody Seller seller) {
		
		Seller getSeller = sellerService.get(id);
		
		if(getSeller != null) {
			getSeller.setFname(seller.getFname());
			getSeller.setSname(seller.getSname());
			getSeller.setEmail(seller.getEmail());
			getSeller.setPhoneNumber(seller.getPhoneNumber());
			getSeller.setAddress(seller.getAddress());
			getSeller.setJoinedDate(seller.getJoinedDate());
		}
		
		sellerService.save(getSeller);
		
		return getSeller;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/sellers/{id}")
	public Seller deleteSeller(@PathVariable(name = "id") Long id) {
		Seller getSeller = sellerService.get(id);
		
		sellerService.delete(id);
		
		return getSeller;
	}
}