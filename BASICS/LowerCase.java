import java.util.Scanner;

public class LowerCase
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String domain = sc.nextLine();
		domain = domain.trim().toLowerCase();

		switch (domain)
		{
			case "us":
			System.out.println("United States");
			break;

			case "de":
			System.out.println("Germany");
			break;

			case "sk":
			System.out.println("Slovakia");
			break;
		}
	}
}