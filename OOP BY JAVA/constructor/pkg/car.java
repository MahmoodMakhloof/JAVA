package pkg;

public class car 
{
	private String maker;
	private int model;
	private static int noofobjects;

	public void setmaker(String m)
	{
		maker = m;
	}
	public void setmodel(int mod)
	{
		if(mod>0)
			model= mod;
		else
			System.out.println("not year!");
	}

	public String getmaker()
	{
		return maker;
	}

	public int getmodel()
	{
		return model;
	}

	public static int getnoofobjects()
	{
		return noofobjects;
	}

	/* constructor */
	/* no data type no retrun value */
	public car ()
	{
		/* default value */
		model= 2010;
		maker = "honda";
		noofobjects++;

	}

	/* overloading constructor */
	public car (String mak , int mod)
	{
		maker = mak;
		model = mod;
		noofobjects++;
	}
}