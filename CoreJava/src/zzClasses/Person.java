package zzClasses;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String fname;//first Name
	private String lname;//Last Name
	private char gender; // M - Male , F-female, O - other
	private LocalDate dob;//Date of Birth
	
	public Person() {
	}
	public Person(String fname, String lname, char gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
	}
	
	public Person(String fname, String lname, char gender, LocalDate dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		Period p = Period.between(dob, LocalDate.now());
		return p.getYears();
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", Age=" + getAge() + "]";
	}
	
	
	
}
