package com.ent.oneToOneMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_table")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	
	/*
	 * If we use only @OneToOne(cascade=CascadeType.ALL), then in User table vehicle_id column will create by default
	 * - to rename the default column name use @JoinColumn
	 */
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinTable(name="User_vehicles_table", joinColumns = @JoinColumn(name="userId"), inverseJoinColumns = @JoinColumn(name="vehicle_id"))
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
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
