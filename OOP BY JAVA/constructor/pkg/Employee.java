package pkg;

public class Employee
{
	private int id;
	private String name;
	private String department;
	private double salary;
	private double bonus;
	private boolean resident;

	public void setId(int i)
	{
		id=i;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setDep(String d)
	{
		department =d;
	}

	public void setSal(double s)
	{
		salary =s;
	}

	public void setSal(double s, double b)
	{
		/* this key word means in this place use ... (method) */
		this.setSal(s);
		bonus = b;
	}

	public void setBon(double b)
	{
		bonus =b;
	}
	public void setRes(boolean r)
	{
		resident =r;
	}

	public void PrintEmployee()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("deb "+department);
		System.out.println("salary "+salary);
		System.out.println("bonus "+bonus);
		System.out.println("resident "+resident);
		
	}

	public Employee (int i,String n)
	{
		id=i;
		name=n;
	}

	public Employee (int i,String n,boolean r)
	{
		this (i,n);
		resident=r;
	}

	public Employee (int i , String n,String dep,double s,double b,boolean r)
	{
		this(i,n,r);
		department=dep;
		bonus=b;
		salary = s;

	}
}	