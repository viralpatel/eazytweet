package net.viralpatel.eazytweet.models;

public class UserId {
	private String id;
	private String name;
	
	public UserId() {
		super();
	}
	public UserId(User user) {
		super();
		this.id = user.getId();
		this.name = user.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
