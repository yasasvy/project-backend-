package com.iboarding.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iboarding.demo.model.User;
import com.iboarding.demo.service.RegistrationService;
 
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
//			System.out.println(tempEmailId);
			User userObj = service.fetchUserByEmailId(tempEmailId);
			if(userObj != null) {
				throw new Exception("User with "+ tempEmailId + " already exists");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user); 
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public int loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempEmailId != null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPass(tempEmailId, tempPass);
		}
		
		if(userObj == null) {
			throw new Exception("invalid credentials");
		}
		return userObj.getId();
	}
	

}
