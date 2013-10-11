package net.viralpatel.eazytweet.repositories;

import net.viralpatel.eazytweet.models.User;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String>{

	public User findByName(String name);
	
}
