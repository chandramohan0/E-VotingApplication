package com.ChandraMohan.E_VotingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.service.ElectionService;

@RestController
public class ElectionController {

	@Autowired
	ElectionService electionService;
	
	@GetMapping("/get/elections")
	public List<Election> getAllElections(){
		return electionService.getAllElections();
	}
	
	@PostMapping("/add/election")
	public Election saveElection(@RequestBody Election election) {
		return electionService.saveElection(election);
	}
}
