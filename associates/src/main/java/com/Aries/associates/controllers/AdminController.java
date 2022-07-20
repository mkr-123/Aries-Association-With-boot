package com.Aries.associates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aries.associates.model.Buyer;
import com.Aries.associates.serviceInterFace.AdimServiceInterFace;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdimServiceInterFace adimServiceInterFace;
	
	@GetMapping("/allBuyer")
	public ResponseEntity<List<Buyer>> getAllBuyer(){
		List <Buyer> buyer=adimServiceInterFace.getAllBuyer();
		return new ResponseEntity<>(buyer,HttpStatus.OK);
		
	}

}
