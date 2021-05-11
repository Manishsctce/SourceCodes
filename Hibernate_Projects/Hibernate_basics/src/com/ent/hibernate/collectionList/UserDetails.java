package com.ent.hibernate.collectionList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
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

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	private String userName;
	
	/*
	 *  @ElementCollection - it is used to declare an element-collection mapping.
	 *  All the records of the collection are stored in a separate table.
	 *  configuration for this table is specified using the @CollectionTable
	 *
	 * @CollectionTable is used to specify the name of the table that stores all the
	 * records of the collection, and the JoinColumn that refers to the primary
	 * table. 
	 * By default listOfAddress will be store in separate table who name will
	 * be UserDetails_listOfAddresses.
	 */

	@ElementCollection
	@CollectionTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name="userId"))
	private List<Address> listOfAddresses = new ArrayList<Address>();
		
	public List<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(List<Address> listOfAddresses) {
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
