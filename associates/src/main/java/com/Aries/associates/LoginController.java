package com.Aries.associates;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/check/{userName}/{password}")
	public Boolean checkValidation(@PathVariable  String userName,@PathVariable String password)
	{
		if(userName.equals("rakesh") && password.equals("om")) {
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}
	
	

}
