package Exercise_3;

public class Staff extends Employee{
private String title;

	Staff(String name, String address, int Phone_number, String email, int a, int b, int c, double salary, String office, String title) {
		super(name, address, Phone_number, email, a, b, c, salary, office);
		this.title = title;
		
	}

	public String toString()
			{
		return super.toString() + " " + title;
			}

}
