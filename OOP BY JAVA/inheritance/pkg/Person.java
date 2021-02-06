package pkg;

public class Person 
{
	private String name;
	private int age;
	private String gender;
	private String phoneNumber;
	private String address;

	public void setName(String n)
	{
		name = n;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setGender(String g)
	{
		gender = g;
	}
	public void setPhoneNumber(String ph)
	{
		phoneNumber = ph;
	}
	public void setAddress(String ad)
	{
		address = ad;
	}

	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public String getAddress()
	{
		return address;
	}

	/* "final" keyword prevent overriding */
	/* so , we can write " public final void printDetails() */
	public void printDetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(phoneNumber);
		System.out.println(address);
		
	}

	public Person(String n,int a,String g,String ph,String ad )
	{
		name = n;
		age = a;
		gender = g;
		phoneNumber = ph;
		address = ad;
	}
}