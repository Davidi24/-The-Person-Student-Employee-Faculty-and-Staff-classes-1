package Exercise_3;

public class Person {
private String name;
protected String address;
private int Phone_number;
private String email;

Person(String name,String address,int Phone_number, String email ){
	this.name = name;
	this.address = address;
	this.Phone_number = Phone_number;
	this.email = email;
}


public String toString() {
	return this.getClass().getSimpleName()+ ": " + name+ " " + address+ " " + Phone_number+ "" + email;

}
}
