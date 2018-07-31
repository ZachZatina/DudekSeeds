package com.gc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_list")
public class ContactListDTO {

	private int guest_number;
	private String visitor_name;
	private String visitor_email;
	private String visitor_comment;
	private String visit_date;

	public ContactListDTO() {
	}

	public ContactListDTO(int guest_number, String visitor_name, String visitor_email, String visitor_comment, String visit_date) {
		super();
		this.guest_number = guest_number;
		this.visitor_name = visitor_name;
		this.visitor_email = visitor_email;
		this.visitor_comment = visitor_comment;
		this.visit_date = visit_date;
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

	@Column
	public String getVisitor_Name() {
		return visitor_name;
	}

	public void setVisitor_Name(String visitor_name) {
		this.visitor_name = visitor_name;
	}
	
	@Column
	public String getVisitor_Email() {
		return visitor_email;
	}

	public void setVisitor_Email(String visitor_email) {
		this.visitor_email = visitor_email;
	}
	
	@Column
	public String getVisitor_Comment() {
		return visitor_comment;
	}

	public void setVisitor_Comment(String visitor_comment) {
		this.visitor_comment = visitor_comment;
	}
	
	@Column
	public String getVisit_Date() {
		return visit_date;
	}

	public void setVisit_Date(String visit_date) {
		this.visit_date = visit_date;
	}

	public String toString() {
		return "String";
	}
}
