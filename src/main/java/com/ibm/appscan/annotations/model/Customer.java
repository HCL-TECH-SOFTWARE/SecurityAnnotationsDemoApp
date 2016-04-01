package com.ibm.appscan.annotations.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Customer {

	@NotEmpty
	String name;

	@Range(min = 1, max = 150)
	int age;

	Logindata logindata;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Logindata getLogindata() {
		return logindata;
	}

	public void setLogindata(Logindata logindata) {
		this.logindata = logindata;
	}


	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

}