public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


	private String email;
	private String project;
	private String company;
	private String salary;
	public Employee(String name, String email, String project, String company, String salary) {
		
		this.name = name;
		this.email = email;
		this.project = project;
		this.company = company;
		this.salary = salary;
	}
	
	
}
