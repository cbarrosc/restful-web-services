package com.in28minutes.rest.webserices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}