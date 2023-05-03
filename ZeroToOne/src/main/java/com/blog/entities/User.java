package com.blog.entities;

import java.sql.Timestamp;

public class User {
	private int id;
	private String name;
	private String profession;
	private String email;
	private String number;
	private String password;
	private Timestamp dateTime;
	private String profile;

//zero argument constructor
	public User() {
		super();

	}

//constructor
	public User(String name, String profession, String email, String number, String password) {
		super();
		this.name = name;
		this.profession = profession;
		this.email = email;
		this.number = number;
		this.password = password;

	}

//getters and setters
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

}
