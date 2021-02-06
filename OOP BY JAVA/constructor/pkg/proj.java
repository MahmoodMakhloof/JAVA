package pkg;

public class proj
{
	public static void main(String []args)
	{
		/*
		rectangle r1 = new rectangle (5,6);
		*/

		/* length not can accessed it's private 
		r1.length = 9;
		System.out.println(r1.length);
		*/

		/*
		r1.setlength(6);
		r1.setwidth(9);
		*/

		/*
		rectangle r2 = new rectangle();
		r2.setlength(20);
		r2.setwidth(4);
		*/

		/*
		System.out.println("rectangle 1 area = "+r1.getarea());
		*/
		/*
		car c1 = new car("toyota",2016);
		System.out.println("My car is "+c1.getmaker()+" and "+c1.getmodel()+" model");
		*/

		/*
		Employee E1 = new Employee(777,"mahmoud","Cs",1500,600,true);
		E1.PrintEmployee();
		*/

		/* print number of objects (static uses)
		car c1=new car();
		car c2=new car();
		car c3=new car();

		System.out.println(car.getnoofobjects());
		*/

		/* static method 
		System.out.println (Calc.mul(7,9));
		*/

		/*
		rectangle myinputobject = new rectangle(10,20);
		// pass object to method by reference
		myinputobject.resetobject(myinputobject);
		System.out.println(myinputobject.getarea());
		*/

		/* add 2 rectangles and print the area of this obj
		rectangle r1 = new rectangle(10,60);
		rectangle r2 = new rectangle(20,10);
		System.out.println(r1.add(r2).getarea());
		*/

		/* == it compars address so it is impossible to be equals
		rectangle r1 = new rectangle(10,60);
		rectangle r2 = new rectangle(10,60);
		if (r1==r2)
			System.out.println("equal");
		else
			System.out.println("not equal"); */

		/* both of objects point to the same address on memory
		r1=r2 */

		/*
		rectangle r1 = new rectangle(10,60);
		rectangle r2 = new rectangle(10,60);
		

		if(r1.isEqual(r2))
			System.out.println("equal");
		else
			System.out.println("not equal");

		*/

		/* deep copy 
		rectangle r2 = new rectangle(2,8);
		rectangle r1 = new rectangle(r2);
		System.out.println(r1.getarea());
		*/

		rectangle r1 = new rectangle(2,6);
		r1.resetobject();
		System.out.println(r1.getarea());





	}
}