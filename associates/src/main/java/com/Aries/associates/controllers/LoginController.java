package com.Aries.associates.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/check/{userName}/{password}")
	public ResponseEntity<Boolean> checkValidation(@PathVariable  String userName,@PathVariable String password)
	{
		if(userName.equals("rakesh") && password.equals("om")) {
			System.out.println(true);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
		System.out.println(false);
		return new ResponseEntity<Boolean>(false,HttpStatus.OK);
	}
	
	

}
