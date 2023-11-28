package com.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="loginUser")
//@AllArgsConstructor
//@Data
//@NoArgsConstructor
public class User {
 @Id
	private String username;
	

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


	public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}


	private String password;
}
