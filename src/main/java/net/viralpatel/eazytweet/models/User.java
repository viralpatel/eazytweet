package net.viralpatel.eazytweet.models;

import java.util.Date;
import java.util.List;

import org.springframework.core.style.ToStringCreator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/*
 * 
users {
	_id,
	name: 'Viral',
	followers: [{id:, name:}, {id:, name:}],
	following: [{id:, name:}, {id:, name:}],
	tweet_count: 123,
	created: ''
}

tweets {
	_id,
	user_id: '123',
	viewers: [{id:, name:}, {id:, name:}]
	text: 'A quick brown fox',
	up_votes: [{id:, name:}, {id:, name:}],
	down_votes: [{id:, name:}, {id:, name:}],
	up_vote_count: ,
	down_vote_count: ,
	created: ''
}
 * 
 */

@Document(collection = "users")
public class User {

	@Id
	private String id;

	private String name;

	private String password;

	private String bio;

	private Long tweetCount = 0l;

	private List<UserId> followers;

	private List<UserId> following;

	private Date created;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getTweetCount() {
		return tweetCount;
	}

	public void setTweetCount(Long tweetCount) {
		this.tweetCount = tweetCount;
	}

	public List<UserId> getFollowers() {
		return followers;
	}

	public void setFollowers(List<UserId> followers) {
		this.followers = followers;
	}

	public List<UserId> getFollowing() {
		return following;
	}

	public void setFollowing(List<UserId> following) {
		this.following = following;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {

		return new ToStringCreator(this).toString();
	}
}
