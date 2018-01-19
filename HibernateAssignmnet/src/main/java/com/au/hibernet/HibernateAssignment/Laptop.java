package com.au.hibernet.HibernateAssignment;

import javax.persistence.*;

@Entity
public class Laptop {
	@Id 
	private int Lid;
	private String Brand;
	private String Price;
	
	
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}

}
