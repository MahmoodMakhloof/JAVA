package pkg;

public class CD implements RetailItem 
{
	double price;
	String title;
	String artist;

	public double getItemPrice()
	{
		return price;
	}

	public void setTitle(String t)
	{
		this.title = t;
	}
	public CD()
	{
		this.price=0;
		this.title = " ";
		this.artist = " ";
	}
	public CD(double p, String t,String a)
	{
		this.price = p;
		this.title = t;
		this.artist = a;
	}
	
}