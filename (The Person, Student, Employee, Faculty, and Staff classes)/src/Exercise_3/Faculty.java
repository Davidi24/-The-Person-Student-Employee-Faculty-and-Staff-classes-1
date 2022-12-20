package Exercise_3;

public class Faculty extends Employee{

	private String office_hour;
	private String rank;
	
	Faculty(String name, String address, int Phone_number, String email,int a,int b , int c,  double salary,String office, String office_hour,String rank ) {
		super(name, address, Phone_number, email,a,b,c,salary,office);
		this.office_hour = office_hour ;
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + " " + office_hour + " " + rank;
	}

}
