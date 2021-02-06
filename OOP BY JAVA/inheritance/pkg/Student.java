package pkg;

public class Student extends Person 
{
	private int grade ;
	private int degree;

	public void setGrade(int gr)
	{
		grade = gr;
	}
	public void setDegree(int de)
	{
		degree = de;
	}

	public int getGrade()
	{
		return grade;
	}
	public int getDegree()
	{
		return degree;
	}

	
	public Student (String n,int a,String g,String ph,String ad,int gr,int deg)
	{
		/* super means the constructor of base class */
		super(n,a,g,ph,ad);

		grade = gr;
		degree = deg;
	}
}