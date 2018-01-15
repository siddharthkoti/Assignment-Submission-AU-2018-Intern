package com.accolite.java.EmployeeForum.services;
import java.util.*;
import com.accolite.EmployeeForum.model.*;

public class EmployeeServices {
	
	static List<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeServices() {
		Employee n = new Employee();
		n.setId(1);
		n.setName("Siddharth");
		
		employeeList.add(n);
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
	
	//add atleast one object/entry
	//http://localhost:8080/EmployeeForum/webapi/employees
	public List<Employee> getAllEmployees(){
		return employeeList;
	}
	
	////http://localhost:8080/EmployeeForum/webapi/employees/1
	public Employee getEmployee(int id){
		//get the employee and return
		
		//Optional<Employee> matchingObject = employeeList.stream().filter(p->p.getId() == id).findFirst();
		for(Employee e: employeeList ) {
			if(e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	







	public String insert(Employee employee){
		// TODO Auto-generated method stub
		int id = employee.getId();
		for(Employee e: employeeList) {
			if(e.getId() == id){
				return "An Employee with id:" + id + " already Exists!Please Retry with another ID";
			}
		}
		
		employeeList.add(employee);
		return "Successfully inserted employee with id:" + employee.getId();	
	}


	public String update(int id, String name) {
		// TODO Auto-generated method stub
		for(Employee e: employeeList){
			if(e.getId() == id){
				
				e.setName(name);
				return "Updated name successfully";
			}
		}
		
		return "Update Unsuccessfull!!\n There is n employee with ID:" + id;
	}








	public String delete(int id) {
		
		
		Iterator<Employee> iterator = employeeList.iterator();
		
		while(iterator.hasNext())
		{
		    Employee e = iterator.next();
		    if (e.getId() == id)
		    {
		        iterator.remove();
		        return "Successfully deleted employee with id:" + id;
		    }
		}
		return "No record found with ID: " + id;
	}
	
	
}
