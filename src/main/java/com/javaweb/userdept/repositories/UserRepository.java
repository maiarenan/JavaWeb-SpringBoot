package com.javaweb.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
