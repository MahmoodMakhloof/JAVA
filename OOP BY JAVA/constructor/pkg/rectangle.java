package pkg;

public class rectangle
{

	private double length;
	private double width;

	public void setlength(double l)
	{
		length=l;
	}

	public void setwidth(double w)
	{
		width=w;
	}

	public double getlength()
	{
		return length;
	}

	public double getwidth()
	{
		return width;
	}

	public double getarea()
	{
		return length*width;
	}

	/* constructor */
	public rectangle()
	{
		length=0;
		width = 0;
	}
	/* overload constructor */
	public rectangle(double l,double w)
	{
		length = l;
		width = w;
	}
	/* copy constructor */
	public rectangle(rectangle r)
	{
		length = r.length;
		width = r.width;
	}

	/* method to reset object by passing object by reference not value */
	public void resetobject()
	{
		this.length=0;
		this.width=0;
	}

	/* return rectangle as add of 2 passed rectangles */
	public rectangle add (rectangle r2)
	{
		rectangle result = new rectangle();
		result.length=this.length+r2.length;
		result.width= this.width+r2.width;
		return result;
	}

	public boolean isEqual(rectangle r2)
	{
		if(this.length== r2.length && this.width==r2.width)
			return true;
		else
			return false;
	}
}	