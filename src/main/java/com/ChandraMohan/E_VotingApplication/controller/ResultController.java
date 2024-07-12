package com.ChandraMohan.E_VotingApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.ElectionChoice;
import com.ChandraMohan.E_VotingApplication.service.ResultService;

@RestController
public class ResultController {

	@Autowired
	ResultService resultService;
	
	@PostMapping("/winner/election")
	public ElectionChoice findElectionChoiceWithMaxVotes(@RequestBody Election election) {
		return resultService.findElectionChoiceWithMaxVotes(election);
	}
}
