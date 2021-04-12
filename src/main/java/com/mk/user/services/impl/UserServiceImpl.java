package com.mk.user.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mk.user.entities.User;
import com.mk.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final String HOST_NAME = "HOSTNAME";

	private static final String DEFAULT_ENV_INSTANCE_GUID = "UNKNOWN";

	// @Value(${ENVIRONMENT_VARIABLE_NAME:DEFAULT_VALUE})
	@Value("${" + HOST_NAME + ":" + DEFAULT_ENV_INSTANCE_GUID + "}")
	private String hostName;

	public User findById(String id) {
		return new User(1L, "John", "23", "john.doe@google.com", hostName);
	}

}