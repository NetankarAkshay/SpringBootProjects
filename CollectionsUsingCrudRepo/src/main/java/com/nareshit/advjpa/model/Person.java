package com.nareshit.advjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_person")
public class Person {
	
	/*
	 * IDENTITY  ==> DAtabase will take care of Populating primary key
	 * 				Database only creates sequence and it autopopulates
	 * 
	 * 
	 * AUTO ==> JPA WILL GET NEXT VALUE FROM SEQUENCE
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="person_id")
	private Integer personId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	
	@Column(name = "created_date")
	private Date createdDate;
	
	private String email;
	
	
	private Integer age;


	public Integer getPersonId() {
		return personId;
	}


	public void setPersonId(Integer personId) {
		this.personId = personId;
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


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Person(String firstName, String lastName,  String email, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdDate = new Date();
		this.email = email;
		this.age = age;
	}
	
	public Person() {}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", createdDate="
				+ createdDate + ", email=" + email + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	

}
