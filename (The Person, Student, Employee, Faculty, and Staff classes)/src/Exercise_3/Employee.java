package Exercise_3;

public class Employee extends Person {
	private String office;
	private double salary;
	MyDate date;
	int a , b , c ;
	
	Employee(String name, String address, int Phone_number, String email,int a,int b , int c,  double salary,String office) {
		
		super(name, address, Phone_number, email);
	
		this.office = office;
		this.salary = salary;
	    this.a = a;
	    this.b = b;
	    this.c = c;
	    date = new MyDate(a,b,c);
	    
	}
	
	

	
	public String toString() {
		return super.toString()+ " "+ date +" " + salary+ " "+ office ;

	}
	

}
