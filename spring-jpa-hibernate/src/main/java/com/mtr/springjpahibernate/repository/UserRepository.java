package com.mtr.springjpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtr.springjpahibernate.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	
	

}
