package net.viralpatel.eazytweet.services;

import java.util.Date;

import net.viralpatel.eazytweet.models.User;
import net.viralpatel.eazytweet.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User create(String username, String password) {

		User user = new User();
		user.setName(username);
		user.setPassword(password);
		user.setCreated(new Date());

		userRepository.save(user);
		
		return user;
	}

	public User findByName(String name) {

		return userRepository.findByName(name);
	}

}
