package com.in28minutes.rest.webservices.restfulwebservices.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
