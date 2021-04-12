package com.mk.user.entities;

public class User {

	Long id;
	String name;
	String age;
	String email;
	String host;

	public User(Long id, String name, String age, String email, String host) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.host = host;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", host=" + host + "]";
	}

}
