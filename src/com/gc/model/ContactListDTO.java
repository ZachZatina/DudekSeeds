package com.gc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact list")
public class ContactListDTO {

	int guest_number;
	String name;
	String email;
	String comment;
	String date;

	public ContactListDTO() {
	}

	public ContactListDTO(int guest_number, String name, String email, String comment, String date) {
		this.guest_number = guest_number;
		this.name = name;
		this.email = email;
		this.comment = comment;
		this.date = date;
	}
	
	@Id
	@GeneratedValue
	@Column(name="guest_number")
	public int getGuestNumber() {
		return guest_number;
	}
	
	public void setGuestNumber(int guest_number) {
		this.guest_number = guest_number;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="comment")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Column(name="date")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
