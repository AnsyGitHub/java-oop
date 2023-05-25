package Aggregation;

public class Address {
	String city;
	String street;
	String country;
	int postal;
public Address(String city, String street, String country, int postal) {
super();
this.city = city;
this.street = street;
this.country = country;
this.postal = postal;
}
@Override
public String toString() {
return "Address [city=" + city + ", street=" + street + ", country=" + country + ", postal=" + postal + "]";
}
}
