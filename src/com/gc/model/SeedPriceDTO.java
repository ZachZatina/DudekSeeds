package com.gc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seed_pricing")

public class SeedPriceDTO {
	
	String type;
	float price;
	float discount;
	int number;
	
	public SeedPriceDTO() {
		
	}
	
	public SeedPriceDTO(String type, float price, float discount, int number) {
		this.type = type;
		this.price = price;
		this.discount = discount;
		this.number = number;
	}
	
	@Column(name = "type")
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name = "price")
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Column(name = "discount")
	public float getDiscount() {
		return discount;
	}
	
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	@Id
	@Column(name = "number")
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

}
