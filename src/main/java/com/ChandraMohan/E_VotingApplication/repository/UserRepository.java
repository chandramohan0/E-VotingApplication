package com.ChandraMohan.E_VotingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ChandraMohan.E_VotingApplication.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findUserByName(String name);
}
