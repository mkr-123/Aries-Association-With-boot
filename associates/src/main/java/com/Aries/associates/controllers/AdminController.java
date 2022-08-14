package com.Aries.associates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aries.associates.model.ApplicationUser;
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
	
	@PostMapping("/addBuyer")
	public ResponseEntity<Buyer> addBuyer(@RequestBody Buyer buyer){
		Buyer newBuyer=adimServiceInterFace.addBuyer(buyer);
		return new ResponseEntity<>(newBuyer,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteBuyer(@PathVariable("id") Long id){
		adimServiceInterFace.deleteBuyer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<Buyer>> findByName(@PathVariable("name") String name)
	{
		List <Buyer> buyer=adimServiceInterFace.getBuyersName(name);
		return new ResponseEntity<>(buyer,HttpStatus.OK);
	}
	
	@GetMapping("/allUsers")
	public ResponseEntity<List<ApplicationUser>> getApplicationUser()
	{
		List <ApplicationUser>applicationUser=adimServiceInterFace.getApplicationUser();
		return new ResponseEntity<>(applicationUser,HttpStatus.OK);
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<ApplicationUser> saveUser(@RequestBody ApplicationUser appUsers){
		ApplicationUser newAppuser=adimServiceInterFace.saveAppUser(appUsers);
		return new ResponseEntity<ApplicationUser>(newAppuser,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId") Long userId)
	{
		adimServiceInterFace.deletUser(userId);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
