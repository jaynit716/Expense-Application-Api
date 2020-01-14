package io.org.jaynit.store;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {

	@Id
	private int sId;
	private String name;
	private String city;
	
	
	public Store() {
		
	}
	
	public Store(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	
	public Store(String name, String city, int sId) {
		super();
		this.name = name;
		this.city = city;
		this.sId = sId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
