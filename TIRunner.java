import java.util.Scanner;
public class TIRunner 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int first = input.nextInt();
		System.out.println("Enter another number:");
		int second = input.nextInt();
		TwoIntegers isaiah = new TwoIntegers(first, second);
		
	}
}
