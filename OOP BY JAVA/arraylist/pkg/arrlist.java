package pkg;

import java.util.ArrayList;

public class arrlist 
{
	public static void main(String[]args)
	{	
		/* default capacity is 10 item */
		/* but we need to increase num of items to 100 */
		ArrayList <String> arr = new ArrayList <String> (100);
		/* add in the last pos of arr */
		arr.add("James");
		arr.add("mahmoud");
		/* print size of arr */
		System.out.println(arr.size());
		/* print data in pos 1 */
		System.out.println(arr.get(1));
		/* print all arr data */
		System.out.println(arr);
		/* remove data in pos 1 */
		arr.remove(1);
		/* insert in 1 pos */
		arr.add(1,"marria");
		/* to replace */
		arr.set(1,"marlin");

		System.out.println(arr);



	}
}

