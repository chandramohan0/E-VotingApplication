package com.ChandraMohan.E_VotingApplication.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	
	@OneToOne
	private User user;
	@ManyToOne
	private Election election;
	@ManyToOne
	private ElectionChoice electionChoice;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Election getElection() {
		return election;
	}
	public void setElection(Election election) {
		this.election = election;
	}
	public ElectionChoice getElectionChoice() {
		return electionChoice;
	}
	public void setElectionChoice(ElectionChoice electionChoice) {
		this.electionChoice = electionChoice;
	}
}
