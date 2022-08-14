package com.Aries.associates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.Aries.associates.model.ApplicationUser;
import com.Aries.associates.model.Buyer;
import com.Aries.associates.repoInterFace.AdimInterFace;
import com.Aries.associates.repoInterFace.ApplicationUserRepoInterface;
import com.Aries.associates.serviceInterFace.AdimServiceInterFace;

@Component
public class AdimService implements AdimServiceInterFace {
	
	@Autowired
	private AdimInterFace adimInterFace;
	
	@Autowired
	private ApplicationUserRepoInterface applicationUserRepoInterface;

	@Override
	public List<Buyer> getAllBuyer() {
		return adimInterFace.findAll(Sort.by(Direction.DESC, "buyerId"));
	}

	@Override
	public Buyer addBuyer(Buyer buyer) {
		return adimInterFace.save(buyer);
	}

	@Override
	public void deleteBuyer(Long id) {
		adimInterFace.deleteById(id);
		
	}

	@Override
	public List<Buyer> getBuyersName(String name) {
		return adimInterFace.getBuyersName(name);
	}

	@Override
	public List<ApplicationUser> getApplicationUser() {
		return applicationUserRepoInterface.findAll();
	}

	@Override
	public ApplicationUser saveAppUser(ApplicationUser appUsers) {
		return applicationUserRepoInterface.save(appUsers);
	}

	@Override
	public void deletUser(Long userId) {
		 applicationUserRepoInterface.deleteById(userId);
	}


}
