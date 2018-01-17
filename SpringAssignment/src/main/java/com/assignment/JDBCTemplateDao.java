package com.assignment;

import java.util.*;
import java.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.*;

import com.mysql.jdbc.PreparedStatement;

@Component("jdbcTemplateDao")
public class JDBCTemplateDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*public int saveStudent(Student student){
		String query = "insert into Student(STUDENT_ID,STUDENT_NAME) values "
				+ "("+student.getStudentId()+",'"+student.getStudentName()+"')";
		return jdbcTemplate.update(query);
	}*/
	
	//Prepared Statement
	
/*		public Boolean saveStudentUsingPreparedStatement(final Student student){
			String query = "insert into Student(STUDENT_ID,STUDENT_NAME) values (?,?)";
			return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

				public Boolean doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					ps.setInt(1, student.getStudentId());
					ps.setString(2, student.getStudentName());
					return ps.execute();
				}
			});
		}*/
	
	public List<Employee> getAllEmployeesRowMapper(){
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			
			public Employee mapRow(ResultSet rs,int rownumber) throws SQLException {
				Employee e = new Employee();

				e.setName(rs.getString(1));
				e.setAge(rs.getInt(2));
				e.setSalary(rs.getInt(3));
				return e;
		}
		});
	}
	
	
	public void insertList(final List<Employee> emps){
		String sql = "INSERT INTO employees VALUES (?, ?, ?)";

		List<Object[]> parameters = new ArrayList<Object[]>();

		for (Employee emp : emps) {
	        parameters.add(new Object[] {emp.getName(),
	            emp.getAge(), emp.getSalary()}
	        );
	    }
	    jdbcTemplate.batchUpdate(sql, parameters);
	}
	
	
	public Employee get5thEmployeebyAge() {
		return jdbcTemplate.query("select * from employees order by salary",new RowMapper<Employee>(){  
			 public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setName(rs.getString(1));
		        e.setAge(rs.getInt(2));  
		          
		        e.setSalary(rs.getInt(3));  
		        return e;  
		    }  
		    }).get(4);  
	}

}
