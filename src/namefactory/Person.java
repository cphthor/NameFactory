/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namefactory;

/**
 *
 * @author thor
 */
public class Person {
	int id;
	int birthyear;
	int gender;
	String firstName;
	String surName;

	public Person(int id, int birthyear, int gender, String firstName, String surName) {
		this.id = id;
		this.birthyear = birthyear;
		this.gender = gender;
		this.firstName = firstName;
		this.surName = surName;
	}

	public int getId() {
		return id;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public int getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurName() {
		return surName;
	}


	
}
