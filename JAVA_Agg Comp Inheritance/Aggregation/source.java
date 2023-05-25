package lab4Agg;

public class source {
	
	public static void main(String [] args)
	{
		Employee emp=new Employee("ayesha",2);
		University uni=new University("UCP",emp);
		
		System.out.println(uni.toString());
	
		
	}

}
