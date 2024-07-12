package com.ChandraMohan.E_VotingApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.ElectionChoice;
import com.ChandraMohan.E_VotingApplication.repository.ElectionChoiceRepository;
import com.ChandraMohan.E_VotingApplication.repository.ElectionRepository;

@Service
@Controller
public class ResultService {

	@Autowired
	ElectionChoiceRepository electionChoiceRepository;
	
	@Autowired
	ElectionRepository electionRepository;
	
	public ElectionChoice findElectionChoiceWithMaxVotes(Election election) {
		// TODO Auto-generated method stub
		Election updatedWinner = electionRepository.findElectionByName(election.getName());
		return electionChoiceRepository.findElectionChoiceWithMaxVotes(updatedWinner.getId());
	}
}
