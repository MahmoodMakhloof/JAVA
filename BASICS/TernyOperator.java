import java.util.Random;

public class TernyOperator
{
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt();
		/* compile error because the shortcut if donsn't work as i think */
		(num>0)? System.out.println("postive"):System.out.println("negative");
		
	}
}