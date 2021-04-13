package com.mk.user.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mk.user.entities.User;
import com.mk.user.repositories.UserRepository;
import com.mk.user.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static final String HOST_NAME = "HOSTNAME";

	private static final String DEFAULT_ENV_INSTANCE_GUID = "UNKNOWN";

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	// @Value(${ENVIRONMENT_VARIABLE_NAME:DEFAULT_VALUE})
	@Value("${" + HOST_NAME + ":" + DEFAULT_ENV_INSTANCE_GUID + "}")
	private String hostName;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		LOGGER.info("Received Request to save HOST_NAME {}. ", hostName);
		user.setHost(hostName);
		return userRepository.save(user);
	}

	@Override
	public User findById(Integer id) {
		LOGGER.info("Received Request to findById {}. ", id);
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}

}