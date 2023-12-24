package com.medhubnexus.project.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medhubnexus.project.Model.User;

public interface UserDao extends JpaRepository<User, Long> {

	Optional<User> findByLogin(String login);
	
}
