import java.util.Arrays;

public class SortArray
{
	public static void main(String[]args)
	{
		int[] array = {90,34,88,55,23,101,25};
		Arrays.sort(array);
		System.out.println("Element of sorted array");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}