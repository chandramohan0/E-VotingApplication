package com.ChandraMohan.E_VotingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ChandraMohan.E_VotingApplication.models.Election;
import com.ChandraMohan.E_VotingApplication.models.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long>{

	@Query(value = "SELECT COUNT(*) FROM vote", nativeQuery = true)
	Long getTotalVotes();

	@Query("SELECT COUNT(v) FROM Vote v WHERE v.election =:election")
	Long countTotalVoteByElection(@Param("election") Election election);

}
