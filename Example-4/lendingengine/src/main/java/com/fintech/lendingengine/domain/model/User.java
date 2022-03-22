package com.fintech.lendingengine.domain.model;

import java.util.Objects;

public class User {
	
	private String firstName; //add final 
	private String lastName;
	private int age;	
	private String occupation;
	
	
	public User(String firstName, String lastName, int age, String occupation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.occupation = occupation;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getOccupation() {
		return occupation;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName, occupation);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(occupation, other.occupation);
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", occupation=" + occupation
				+ "]";
	}

	
	
	
}
