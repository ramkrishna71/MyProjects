package com.aartek.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;

@Controller
public class RegistrationController {
	
	public String registrationUser(Map map){
		System.out.println("Registration");
		
		return "ramakrihsna";
		
	}

}
