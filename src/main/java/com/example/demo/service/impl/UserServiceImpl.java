package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.exception.UserManagementException;
import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@Service
public class UserServiceImpl implements Userservice {

	@Autowired
	private UserRepository userRepository;

	public void addMember(User user) {
		User dbUser = userRepository.findByFirstName(user.getFirstName());
		if (dbUser != null) {
			throw new UserManagementException(ErrorMessages.MEMBER_ALREDY_EXISTS);
		}
		User userToSave = User.transform(user);
		userRepository.insert(userToSave);

	}

}
