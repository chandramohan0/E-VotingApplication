package com.ChandraMohan.E_VotingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.repository.ElectionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ElectionService {

	@Autowired
	ElectionRepository electionRepository;

	public List<Election> getAllElections() {
		// TODO Auto-generated method stub
		return electionRepository.findAll() ;
	}

	public Election saveElection(Election election) {
		// TODO Auto-generated method stub
		return electionRepository.save(election);
	}
}
