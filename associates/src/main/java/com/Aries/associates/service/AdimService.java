package com.Aries.associates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Aries.associates.model.Buyer;
import com.Aries.associates.repoInterFace.AdimInterFace;
import com.Aries.associates.serviceInterFace.AdimServiceInterFace;

@Component
public class AdimService implements AdimServiceInterFace {
	
	@Autowired
	private AdimInterFace adimInterFace;

	@Override
	public List<Buyer> getAllBuyer() {
		return adimInterFace.findAll();
	}

}
