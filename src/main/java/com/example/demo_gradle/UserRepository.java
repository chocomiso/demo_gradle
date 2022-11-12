package com.example.demo_gradle;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import com.example.demo_gradle.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}