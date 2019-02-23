package com.udemy.service.impl;

import com.udemy.model.user;
import com.udemy.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected userjparepository userjparepository;

	@Override
	public user save(user user) {
		return this.userjparepository.save(user);
	}
}
	