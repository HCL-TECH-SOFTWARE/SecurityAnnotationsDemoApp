package com.ibm.appscan.annotations.model;

import org.hibernate.validator.constraints.NotEmpty;
import com.ibm.security.annotation.*;

public class Logindata {

	@NotEmpty
	String username;

	@NotEmpty
	String password;
	
	String otherData;
	
	public Logindata(String username, String password, String otherData)
	{
	   this.username = username;
	   this.password = password;
	   this.otherData = otherData;
	   System.out.println(otherData);
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
	
	public String getOtherData() {
		return otherData;
	}

	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}

	
	@Override
	public String toString() {
		return "";
	}

}