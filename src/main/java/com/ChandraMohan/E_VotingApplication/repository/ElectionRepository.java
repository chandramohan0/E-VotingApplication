package com.ChandraMohan.E_VotingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ChandraMohan.E_VotingApplication.models.Election;

public interface ElectionRepository extends JpaRepository<Election, Long>{

	Election findElectionByName(String name);
}
