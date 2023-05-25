package lab4Composition;

public class Person {
	
	String name;
	
	Location loc;
	
	public Person() {
		loc= new Location();
	
	}

	public Person(String name, int x,int y) {
		super();
		this.name=name;
		loc=new Location(x,y);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(int x,int y) {
		loc.setX(x);
		loc.setY(y);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", loc=" + loc + "]";
	}
	
	
	

}
