package com.trainingguru.microservices;

import javax.persistence.Entity;
import javax.persistence.Id;

// We should have a corresponding table "Customer"
@Entity
public class Customer {
	// This represents the primary key from "Customer table"
	@Id
	Integer custId; // CUST_ID
	
	// Normal columns
	String firstName; // FIRST_NAME
	String lastName; // LAST_NAME
	long phoneNumber; // PHONE_NUMBER
	String emailId; // EMAIL_ID
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String firstName, String lastName, long phoneNumber, String emailId) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + "]";
	}
	
	
	
	
}
