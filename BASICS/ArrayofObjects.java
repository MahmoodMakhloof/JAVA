public class ArrayofObjects
{
	public static void main(String[] args)
	{
		Rectangle[] reclist = new Rectangle[10];
		reclist[5].setSize(5,10);

		for(int i=0 ; i<reclist.length; i++)
		{
			reclist[i]=new Rectangle();
		}
	}
}

/* i can't understand how i get output
check it later */