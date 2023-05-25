package lab4Agg;

public class University {
	
	private String name;
	
	Employee emp;
	
	public University() {
		
	}

	public University(String name, Employee emp) {
		super();
		this.name = name;
		this.emp = emp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", emp=" + emp + "]";
	}
	
	
	
	

}
