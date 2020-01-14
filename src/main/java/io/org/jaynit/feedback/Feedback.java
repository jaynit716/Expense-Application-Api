package io.org.jaynit.feedback;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback() {
		
	}
	
	
	public Feedback(int id, String name, String email, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

}
