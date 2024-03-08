package com.realtime.java.ex;

public class StudentJavaBook
{      
	// double mobile;long module
	private String firstname,lastname,email;

	public StudentJavaBook(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentJavaBook [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	

}
