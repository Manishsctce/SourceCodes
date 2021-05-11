package com.ent.collectionSet;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	
	@ElementCollection
	//By default listOfAddress will be store in separate table who name will be UserDetails_listOfAddresses. 
	//Now to define the table name
	@JoinTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name="userId"))
	//@JoinTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name="userId"), inverseJoinColumns = @JoinColumn(name="addrid"))
	private Set<Address> listOfAddresses = new HashSet<Address>();
		
	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
