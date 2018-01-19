package com.au.hibernet.HibernateAssignment;

import java.util.*;
import javax.persistence.*;


@Entity
public class Employee {
	@Id
	private int Eid;
	private String Name;
	private int Salary;
	
	@OneToOne
	private Laptop laptop;
	
	@OneToMany
	private List<Expenses> expenses = new ArrayList<Expenses>();
	
	
	public List<Expenses> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	

}
