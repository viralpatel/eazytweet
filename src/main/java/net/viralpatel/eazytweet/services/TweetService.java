package net.viralpatel.eazytweet.services;

import java.util.Date;
import java.util.List;

import net.viralpatel.eazytweet.models.Tweet;
import net.viralpatel.eazytweet.models.User;
import net.viralpatel.eazytweet.models.UserId;
import net.viralpatel.eazytweet.repositories.TweetRepository;
import net.viralpatel.eazytweet.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {

	@Autowired
	private TweetRepository tweetRepository;

	@Autowired
	private UserRepository userRepository;

	public Tweet create(String userId, String text) {

		User user = userRepository.findOne(userId);

		Tweet tweet = new Tweet();
		tweet.setText(text);
		tweet.setUser(new UserId(user));
		tweet.setViewers(user.getFollowers());
		tweet.setUpVotesCount(0l);
		tweet.setDownVotesCount(0l);
		tweet.setCreated(new Date());

		tweetRepository.save(tweet);

		user.setTweetCount(user.getTweetCount() + 1);

		userRepository.save(user);

		return tweet;
	}

	public List<Tweet> listViewerTweet(String viewerId) {

		User user = userRepository.findOne(viewerId);

		List<Tweet> tweets = tweetRepository.findByViewers(new UserId(user));

		return tweets;
	}


	public List<Tweet> listUserTweet(String userId) {

		User user = userRepository.findOne(userId);

		List<Tweet> tweets = tweetRepository.findByUser(new UserId(user));

		return tweets;
	}

}
