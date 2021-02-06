package pkg;

public class HouredEmployee extends Employee 
{
	private double workingHoures;
	private double houreRate;


	public void setWorkingHours(double h)
	{
		workingHoures = h;
	}
	public void setHourRate(double hr)
	{
		houreRate = hr;
	}

	public double getWorkingHours()
	{
		return workingHoures;
	}
	public double getHourRate()
	{
		return houreRate;
	}


	@Override
	public double getSalary()
	{
		return houreRate * workingHoures;
	}


	public HouredEmployee(String n,int a,String g,String ph,String ad ,String j,double sal,double wh,double hr)
	{
		super(n,a,g,ph,ad,j,sal);
		workingHoures = wh;
		houreRate = hr;
	}
}