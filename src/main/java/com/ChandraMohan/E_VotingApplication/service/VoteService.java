package com.ChandraMohan.E_VotingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.ElectionChoice;
import com.ChandraMohan.E_VotingApplication.models.User;
import com.ChandraMohan.E_VotingApplication.models.Vote;
import com.ChandraMohan.E_VotingApplication.repository.ElectionChoiceRepository;
import com.ChandraMohan.E_VotingApplication.repository.ElectionRepository;
import com.ChandraMohan.E_VotingApplication.repository.UserRepository;
import com.ChandraMohan.E_VotingApplication.repository.VoteRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class VoteService {
	
	@Autowired
	VoteRepository voteRepository;

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ElectionChoiceRepository electionChoiceRepository;
	
	@Autowired
	ElectionRepository electionRepository;
	
	public List<Vote> getAllVotes() {
		// TODO Auto-generated method stub
		return voteRepository.findAll();
	}

	public Long getTotalVotes() {
		// TODO Auto-generated method stub
		return voteRepository.getTotalVotes();
	}

	public Vote addVote(Vote vote) {
		// TODO Auto-generated method stub
		Vote updatedVote = new Vote();
		User user = userRepository.findUserByName(vote.getUser().getName());
		Election election = electionRepository.findElectionByName(vote.getElection().getName());
		ElectionChoice electionChoice = electionChoiceRepository.findElectionChoiceByNameAndElection(vote.getElectionChoice().getName(), election);
		updatedVote.setElection(election);
		updatedVote.setElectionChoice(electionChoice);
		updatedVote.setUser(user);
		return voteRepository.save(updatedVote);
	}

	public Long countTotalVoteByElection(Election election) {
		return voteRepository.countTotalVoteByElection(election);
	}
	
}
