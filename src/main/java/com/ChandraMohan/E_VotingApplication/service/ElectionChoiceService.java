package com.ChandraMohan.E_VotingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.ElectionChoice;
import com.ChandraMohan.E_VotingApplication.repository.ElectionChoiceRepository;
import com.ChandraMohan.E_VotingApplication.repository.ElectionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ElectionChoiceService {

	@Autowired
	ElectionChoiceRepository electionChoiceRepository;
	
	@Autowired
	ElectionRepository electionRepository;

	
	public ElectionChoice saveElectionChoice(ElectionChoice electionChoice) {
		// TODO Auto-generated method stub
		ElectionChoice updatedElectionChoice = new ElectionChoice();
		Election election = electionRepository.findElectionByName(electionChoice.getElection().getName());
		updatedElectionChoice.setName(electionChoice.getName());
		updatedElectionChoice.setElection(election);
		return electionChoiceRepository.save(updatedElectionChoice);
	}
	
	public List<ElectionChoice> getAllElectionChoices() {
		// TODO Auto-generated method stub
		return electionChoiceRepository.findAll();
	}

	public Long getAllChoicesOfElection(Election election) {
		// TODO Auto-generated method stub
		Election updatedElection = electionRepository.findElectionByName(election.getName());
		return electionChoiceRepository.countByElection(updatedElection);
	}
}
