package Exercise_3;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("David", "Tirane", 68 , " @gmail");
		Student s1 = new Student ("David", "Tirane", 68 , " @gmail", "sophomore");
		Employee e1 = new Employee("David", "Tirane", 68 , " @gmail",12,3,2022,4000,"2A");
		Faculty f1 = new Faculty("David", "Tirane", 68 , " @gmail",12,3,2022,4000,"2A","Monday-Friday" , "lol");
		Staff st1 = new Staff("David", "Tirane", 68 , " @gmail",12,3,2022,4000,"2A", "huu");
		System.out.println(p1);
		System.out.println(s1);
		System.out.println(e1);
		System.out.println(f1);
		System.out.println(st1);

	}

}
