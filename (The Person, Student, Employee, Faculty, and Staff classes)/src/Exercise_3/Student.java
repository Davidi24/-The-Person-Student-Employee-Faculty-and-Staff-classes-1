package Exercise_3;

public class Student extends Person {
	
 private String StStatus;
	Student(String name, String address, int Phone_number, String email, String StStatus) {
		super(name, address, Phone_number, email);
		this.StStatus = StStatus;
	}

	
	public String toString() {
		return super.toString() + " "+ StStatus;
	}
	
}
