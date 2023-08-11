import java.util.Scanner;

public class ReverseNumbers 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] myArray = new int[10];
		
		for (int i = 0; i < 10; i++)
		{
		   System.out.println("Enter a number: ");
		   myArray[i] = in.nextInt();
		}
		 
		for (int j = 9; j >= 0; j--)
		{
		   System.out.print(myArray[j] + " ");
		}
	}
}

