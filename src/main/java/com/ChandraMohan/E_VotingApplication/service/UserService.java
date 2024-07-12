package com.ChandraMohan.E_VotingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChandraMohan.E_VotingApplication.models.User;
import com.ChandraMohan.E_VotingApplication.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
