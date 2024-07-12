package com.ChandraMohan.E_VotingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChandraMohan.E_VotingApplication.models.User;
import com.ChandraMohan.E_VotingApplication.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/add/user")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/get/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
