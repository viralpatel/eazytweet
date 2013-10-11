package net.viralpatel.eazytweet.models;

import java.util.Date;
import java.util.List;

import org.springframework.core.style.ToStringCreator;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
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

@Document(collection = "tweets")
public class Tweet {

	@Id
	private String id;

	private String text;

	@Indexed
	private UserId user;

	@Indexed
	private List<UserId> viewers;

	private List<UserId> upVotes;

	private List<UserId> downVotes;

	private Long upVotesCount;

	private Long downVotesCount;

	private Date created;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public UserId getUser() {
		return user;
	}

	public void setUser(UserId user) {
		this.user = user;
	}

	public List<UserId> getViewers() {
		return viewers;
	}

	public void setViewers(List<UserId> viewers) {
		this.viewers = viewers;
	}

	public List<UserId> getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(List<UserId> upVotes) {
		this.upVotes = upVotes;
	}

	public List<UserId> getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(List<UserId> downVotes) {
		this.downVotes = downVotes;
	}

	public Long getUpVotesCount() {
		return upVotesCount;
	}

	public void setUpVotesCount(Long upVotesCount) {
		this.upVotesCount = upVotesCount;
	}

	public Long getDownVotesCount() {
		return downVotesCount;
	}

	public void setDownVotesCount(Long downVotesCount) {
		this.downVotesCount = downVotesCount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {

		return new ToStringCreator(this).toString();
	}
}
