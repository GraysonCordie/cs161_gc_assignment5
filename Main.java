package edu.cgcc.cs161;

import java.time.LocalDate;

//HEADER
//Program Name: Assignment 5
//Author: Grayson Cordie
//Class: CS161 Winter 2021
//Date: 2/7/2021
//Description: Prints first and last name + first, last, and age based on person class.

public class Main {
	
	/*PSUEDOCODE
	 * Instantiates a new person class with name "Grayson Cordie" and birthdate of 3/15/2002.
	 * Prints the full name based on the return from the getName() method.
	 * Prints all info based on return from getInfo() method.
	 * Uninstantiated person.
	 */

	public static void main(String[] args) {

		Person pers = new Person("Grayson", "Cordie", LocalDate.of(2002,  02, 15));
		
		System.out.println(pers.getName());
		
		System.out.println(pers.getInfo());
		
		pers = null;		
		
	}

}

/* FOOTER
 * Grayson Cordie
 * Grayson Cordie 18
 */
