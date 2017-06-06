package com.kumar.authenticator;

public class UserInformation {

	String name;
	Integer id;
	Integer Secret;
	public Integer calcualteKey(){
		return id*Secret;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSecret() {
		return Secret;
	}
	public void setSecret(Integer secret) {
		Secret = secret;
	}
	
}
