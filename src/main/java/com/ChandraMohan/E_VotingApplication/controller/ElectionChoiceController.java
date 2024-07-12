package com.ChandraMohan.E_VotingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.ElectionChoice;
import com.ChandraMohan.E_VotingApplication.service.ElectionChoiceService;

@RestController
public class ElectionChoiceController {

	@Autowired
	ElectionChoiceService electionChoiceService;
	
	@PostMapping("/add/electionChoice")
	public ElectionChoice saveElectionChoice(@RequestBody ElectionChoice electionChoice) {
		return electionChoiceService.saveElectionChoice(electionChoice);
	}
	
	@GetMapping("/get/electionChoices")
	public List<ElectionChoice> getAllElectionChoices() {
		return electionChoiceService.getAllElectionChoices();
	}
	
	@PostMapping("/count/election/choices")
	public Long getAllChoicesOfElection(@RequestBody Election election){
		return electionChoiceService.getAllChoicesOfElection(election);
	}
}
