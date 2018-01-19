package com.au.hibernet.HibernateAssignment;

import javax.persistence.*;

@Entity
public class Expenses {
	
	@Id
	private int Exid;
	private int amount;
	
	
	public int getExid() {
		return Exid;
	}
	public void setExid(int exid) {
		Exid = exid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
