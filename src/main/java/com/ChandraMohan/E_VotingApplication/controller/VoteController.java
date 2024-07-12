package com.ChandraMohan.E_VotingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.Vote;
import com.ChandraMohan.E_VotingApplication.service.VoteService;

@RestController
public class VoteController {

	@Autowired
	VoteService voteService;
	
	@GetMapping("/get/votes")
	public List<Vote> getAllVotes(){
		return voteService.getAllVotes();
	}
	
	@PostMapping("/add/vote")
	public Vote addVote(@RequestBody Vote vote) {
		return voteService.addVote(vote);
	}
	
	@GetMapping("/count/votes")
	public Long getTotatlVote() {
		return voteService.getTotalVotes();
	}
	
	@PostMapping("/count/election/votes")
	public Long countTotalVoteByElection(@RequestBody Election election) {
		return voteService.countTotalVoteByElection(election);
	}
}
