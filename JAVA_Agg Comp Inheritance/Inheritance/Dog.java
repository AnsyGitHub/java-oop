package lab4Inheritance;

public class Dog extends animal{
	
	String name;
	
	public Dog() {
		super();
	
	}
	
	
	public void sound()
	{
		System.out.println("Bark");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name,String type) {
		super(type);
		this.name = name;
		
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + "]";
	}
	
	
	
	

}
