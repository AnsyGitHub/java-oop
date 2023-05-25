package lab4Inheritance;

public class animal {
	
	String type;
	
	public animal() {
		super();
		
	}
	public void display()
	{
		System.out.println("Animal");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public animal(String type) {
		super();
		this.type = type;
	}
	

}
