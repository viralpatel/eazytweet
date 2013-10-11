package net.viralpatel.eazytweet.repositories;

import java.util.List;

import net.viralpatel.eazytweet.models.Tweet;
import net.viralpatel.eazytweet.models.UserId;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TweetRepository extends MongoRepository<Tweet, String>{
	
	public List<Tweet> findByViewers(UserId user);
	
	public List<Tweet> findByUser(UserId user);
	
	
}
