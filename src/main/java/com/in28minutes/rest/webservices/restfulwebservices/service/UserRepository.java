package com.in28minutes.rest.webservices.restfulwebservices.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
