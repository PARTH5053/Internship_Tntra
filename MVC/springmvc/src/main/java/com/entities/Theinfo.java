package com.entities;
//import com.example.validatingforminput;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Theinfo { 
	@NotNull
	private String name;
	@NotNull
	@Email(message = "Email should be valid")
	private String email;
	@NotNull
	@Min(value = 10, message = "Number must be greater than 10")
	@Max(value = 12, message = "Number must be smaller than 12")
	private String phone;
	public Theinfo(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	
	public Theinfo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+" : "+this.getEmail()+" : "+this.getPhone();
	}
	
}

