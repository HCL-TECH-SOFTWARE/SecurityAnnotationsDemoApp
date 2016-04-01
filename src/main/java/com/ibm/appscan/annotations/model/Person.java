package com.ibm.appscan.annotations.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Person {

	@NotEmpty
	String personalId;

	@Range(min = 1, max = 150)
	int groupId;


	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId= groupId;
	}

	public Person(String personalId, int groupId) {
	  this.personalId = personalId;
	  this.groupId= groupId;
	}
}