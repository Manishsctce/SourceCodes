package org.javabrains.koushik.hibernate.lazyLoadingDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@ElementCollection(fetch=FetchType.EAGER)
	//By default listOfAddress will be store in separate table who name will be UserDetails_listOfAddresses. 
	//Now to define the table name
	@JoinTable(name="USER_ADDRESS")
	
	//to define the Generator class 
	@GenericGenerator(name="hilo-gen", strategy="hilo")
	//to use the Generator class with collection
	@CollectionId(columns = {@Column(name="Addr_id")}, generator="hilo-gen", type= @Type(type="long"))
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
