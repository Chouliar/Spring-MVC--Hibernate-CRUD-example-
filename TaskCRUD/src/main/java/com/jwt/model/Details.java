package com.jwt.model;

import java.io.Serializable;
//import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name= "personalinfo")

public class Details implements Serializable {
	
	
	private static final long serialVersionUID = -123786145L;
	
	@Id
    @Column(name = "employeeId")
	private int employeeId;
	
	@Column
	private Double salary;
	
	@Column
	//@Temporal(TemporalType.DATE)
	private String dateofbirth;
	
	@Column
	//@Temporal(TemporalType.DATE)
	private String dateofhire;
	
	@Column
	private String address;
	
	@Column
	private String phonenumber;
	
	@Column
	private String gender;
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getDateofbirth() {
		
		
		return dateofbirth;
	}
	
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public String getDateofhire() {
		return dateofhire;
	}
	
	public void setDateofhire(String dateofhire) {
		this.dateofhire = dateofhire;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
}