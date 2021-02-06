package pkg;

public class SalariedEmployee extends Employee 
{
	private double bonus;
	private double deduction;


	public void setBonus(double bo)
	{
		bonus = bo;
	}
	public void setDeduction(double ded)
	{
		deduction = ded;
	}

	public double getBonus()
	{
		return bonus;
	}
	public double getDeduction()
	{
		return deduction;
	}


	@Override
	public double getSalary()
	{
		return (salary + bonus - deduction);
	}


	public SalariedEmployee(String n,int a,String g,String ph,String ad ,String j,double sal ,double bo,double ded)
	{
		super(n,a,g,ph,ad,j,sal);
		bonus = bo;
		deduction = ded;
	}
}