package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "login")

public class Login implements Serializable{
	
	public enum adminlevel{level1,level2,level3,level4};
	
	private static final long serialVersionUID = -65L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	@Column(name = "username")
	private String username;
	
	@Column(name ="password")
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "adminlevel")
	private adminlevel level;
	
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAdminlevel(adminlevel level) {
		this.level = level;
	}
	
	public adminlevel getAdminlevel() {
		return level;
	}
	
}
