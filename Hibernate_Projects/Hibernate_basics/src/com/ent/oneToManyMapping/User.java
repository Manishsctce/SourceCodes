package com.ent.oneToManyMapping;

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
import javax.persistence.Table;

@Entity
@Table(name="USER_table")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	
	/*
	 * @JoinTable used in an association to customize the generated join table or to map the existing join table. 
	 * 'joinColumns' is used to specify foreign key column of the join table which references the source table (the owner of the association).
	 * 'inverseJoinColumns' is used to specify foreign key column of the join table which references the target table (the inverse side of the association).
	 */
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="User_vehicles_table", joinColumns = @JoinColumn(name="userId"), inverseJoinColumns = @JoinColumn(name="vehicle_id"))
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
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
