package com.ent.collectionSet;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addrid;
	
	@Column(name="STREET_NAME")	
	private String street;
	
	@Column(name="CITY_NAME")
	private String city;
	
	@Column(name="STATE_NAME")
	private String state;
	
	@Column(name="PIN")
	private String pincode;

	
	public int getAddrid() {
		return addrid;
	}
	
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
}
