package Aggregation;

public class source {
	public static void main(String args[])
	{
		Address a1 = new Address("Lahore","5","Pakistan",4090);
		Employee e1 = new Employee("Taya",01,a1);
		System.out.println(e1.toString());
	}
}
