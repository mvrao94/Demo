package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	@Query("{'FirstName' : {$regex: ?0, $options: 'i' }}")
	User findByFirstName(final String firstName);

}
