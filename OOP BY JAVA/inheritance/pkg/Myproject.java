package pkg;

public class Myproject 
{
	public static void main(String []args)
	{
		Student s1 = new Student("mahmoud",22,"male","01016180477","menoufia",99,3);
		s1.setName("Mahmoud Makhlouf");
		System.out.println(s1.getName());

		SalariedEmployee se1 = new SalariedEmployee("Samir",66,"male","0126809450","cairo" ,"programer",15000 ,500,700);
		System.out.println(se1.getSalary());
		se1.printDetails();

		/*
		Employee e1 = new Employee("Samir",66,"male","0126809450","cairo" ,"programer",15000);
		e1.printDetails(); */


		/* Employee is refrence , while SalariedEmployee is an object */
		/* Employee e2 = new SalariedEmployee(); */

		HouredEmployee he1 = new HouredEmployee("Samir",66,"male","0126809450","cairo" ,"programer",1500,1000,30);
		he1.printDetails();

	}
}