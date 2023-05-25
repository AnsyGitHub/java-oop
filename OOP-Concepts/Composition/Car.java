package Composition;
public class Car {
	Engine e;
	String Company;
	public Car(int cc, String company) {
		super();
		Company = company;
		e = new Engine(cc);
	}
	@Override
	public String toString() {
		return "Car [e=" + e + ", Company=" + Company + "]";
	}
	
}
