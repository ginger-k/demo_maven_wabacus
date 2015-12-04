package com.fccs.data.demo.pojo;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="visual_user")
public class Demo {
	@Id
	@GeneratedValue(generator = "UUID")
	@Column(name="user_id")
    private String id;

	@Column(name="user_name")
    private String name;

	
	@Column(name="user_password")
    private String password;


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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

   
   
}