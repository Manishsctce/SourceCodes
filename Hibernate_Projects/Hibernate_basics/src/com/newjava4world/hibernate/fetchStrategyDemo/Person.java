package com.newjava4world.hibernate.fetchStrategyDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
 
import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
 
@Entity
//@Table(name="PERSON",schema="SYSTEM")
@Table(name="PERSON")
public class Person implements Serializable {
 
    private static final long serialVersionUID = 4333499410830154895L;
 
    private int id = 0;
    private String firstName = null;
    private String lastName = null;
 
    private List<Address> addresses = new ArrayList<Address>();
     
    @Id
    @Generated(value="assigned")
    @Column(name="ID")
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    @Column(name="FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    @Column(name="LAST_NAME")
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @OneToMany(mappedBy="person", cascade=CascadeType.ALL)
    @Column(name="id")
  //@Fetch(FetchMode.SELECT)
  //@Fetch(FetchMode.SUBSELECT)
  //@BatchSize(size=2)
    //@BatchSize(size=2)
    public List<Address> getAddresses() {
        return addresses;
    }
 
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
     
    public void addAddress(Address address) {
        address.setPerson(this);
        this.addresses.add(address);
         
    }
     
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPerson :: ");
        sb.append("Id: ");
        sb.append(this.id);
        sb.append(", ");
        sb.append("First name: ");
        sb.append(this.firstName);
        sb.append(", ");
        sb.append("Last name: ");
        sb.append(this.lastName);
        sb.append(" ");
        sb.append("\n");
         
        return sb.toString();
    }
     
}