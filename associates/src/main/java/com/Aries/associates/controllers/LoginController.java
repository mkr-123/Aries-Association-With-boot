package com.Aries.associates.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aries.associates.model.ApplicationUser;
import com.Aries.associates.serviceInterFace.AdimServiceInterFace;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private AdimServiceInterFace adimServiceInterFace;
	
	@RequestMapping("/check/{userName}/{password}")
	public ResponseEntity<Boolean> checkValidation(@PathVariable  String userName,@PathVariable String password)
	{
		List <ApplicationUser> applicationUser=adimServiceInterFace.getApplicationUser();
		for(ApplicationUser appUser:applicationUser) {
		if(userName.equalsIgnoreCase(appUser.getApplicationUserName()) && password.equals(appUser.getPassword())) {
			System.out.println(true);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
		}
		System.out.println(false);
		return new ResponseEntity<Boolean>(false,HttpStatus.OK);
	}
	
	

}
