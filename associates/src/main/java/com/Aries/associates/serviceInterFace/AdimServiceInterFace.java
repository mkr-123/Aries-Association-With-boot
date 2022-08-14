package com.Aries.associates.serviceInterFace;

import java.util.List;

import com.Aries.associates.model.ApplicationUser;
import com.Aries.associates.model.Buyer;

public interface AdimServiceInterFace {

	List<Buyer> getAllBuyer();

	Buyer addBuyer(Buyer buyer);

	void deleteBuyer(Long id);

	List<Buyer> getBuyersName(String name);

	List getApplicationUser();

	ApplicationUser saveAppUser(ApplicationUser appUsers);

	void deletUser(Long userId);
	
	

}
