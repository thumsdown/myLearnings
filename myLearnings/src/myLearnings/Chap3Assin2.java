package myLearnings;
import java.util.Scanner;

public class Chap3Assin2 {
	
	public static void main(String []argv)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		if (num == 0 || num == 1)
		{
			System.out.println("Please enter number greater than equal to 2\n");
			return;
		}
		PrimeNumCalculator checker = new PrimeNumCalculator();
		if ( true == checker.CheckPrime(num) )
			System.out.println("Number is a Prime :)");
		else
			System.out.println("Number is composite");
						
	}

}
