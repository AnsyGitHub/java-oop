package Aggregation;

public class Employee {
	String Name;
	int ID;
	Address ad;
	
	public Employee() {
		super();
		Name = "\0";
		ID = 0;
	}
	
	public Employee(String name, int iD, Address ad) {
		super();
		Name = name;
		ID = iD;
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", ID=" + ID + ", ad=" + ad + "]";
	}
	
	
}
