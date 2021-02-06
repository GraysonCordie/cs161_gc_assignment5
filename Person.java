package edu.cgcc.cs161;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	
	String firstName;
	String lastName;
	int age;
	
	LocalDate birthDate;
	
	Person(String f, String l, LocalDate a) {
		
		changeInformation(f, l, a);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String f) {
		//Checks if argument matches normal expression of letters a-z and A-Z.
		if(f.matches("^[a-zA-Z]*$")) {
		firstName = f;
		}else {
			returnError();
			firstName = "Invalid first name";
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String l) {
		//Checks if argument matches normal expression of letters a-z and A-Z.
		if(l.matches("^[a-zA-Z]*$")) {
		lastName = l;
		}else {
			returnError();
			lastName = "Invalid last name";
		}
	}
	
	public int getAge() {
		return age;
	}
	
//	public void setAge(int a) {
//		
//		if (a>=0 && a<=125) {
//			age = a;
//		} else {
//			returnError();
//		}
//
//	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getInfo() {
		return firstName + " " + lastName + " " + age;
	}
	
	public void changeInformation(String f, String l, LocalDate d) {
		
		setFirstName(f);
		setLastName(l);
		changeBirthdate(d);
//		setAge(a);
	}
	
	public void changeBirthdate(LocalDate d) {
		birthDate = d;
		age = calculateAge(d);
	}
	
	private int calculateAge(LocalDate a) {
		//Returns the period of years between argued date and now.
		return Period.between(a,  LocalDate.now()).getYears();
	}
	
	
	private void returnError() {
		System.out.println("No.");
	}
	
}
