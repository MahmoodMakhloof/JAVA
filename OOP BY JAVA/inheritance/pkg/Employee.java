package pkg;
public abstract class Employee extends Person 
{
	/* if private, the SalariedEmployee can't access salary */
	/* so we used "protected" keyword */ 
	protected double salary;
	private String job;

	public void setJob(String j)
	{
		job = j;
	}
	public void setSalary(double s)
	{
		salary = s;
	}

	public String getJob()
	{
		return job;
	}
	public abstract double getSalary();


	@Override
	public void printDetails()
	{
		super.printDetails();
		System.out.println(job);
		System.out.println(this.getSalary());
		
	}

	public Employee(String n,int a,String g,String ph,String ad ,String j,double sal )
	{
		super(n,a,g,ph,ad);
		job = j;
		salary = sal;
	}



}