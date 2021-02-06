package pkg;

public class proj 
{
	public static void main(String[]args)
	{
		RegisterForm R1 = new RegisterForm();
		
		R1.stdname = "mona";
		
		try
		{
			R1.stdgender = Gender.Female;
			R1.stdcourse = Course.Math;
			R1.stdsemester = Semester.Winter;


			System.out.println(R1.stdname);
			System.out.println(R1.stdgender);
			System.out.println(R1.stdcourse);
			System.out.println(R1.stdsemester);
		}

		catch (IllegalAccessException s )
		{
			System.out.println("IllegalAccessException , data can't be edited!");
		}
		/* public exception */
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}
}




/* Study this lesson again to solve this problem */
/* Revsion on enum and exception handelling */