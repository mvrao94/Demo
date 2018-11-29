package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.service.Userservice;

@Service
public class UserServiceImpl implements Userservice {

	@Autowired
	private UserRepository userRepository;


}
