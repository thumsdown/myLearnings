package myLearnings;
import java.lang.Math;
import java.util.*;

public class Chap3Assin1 {

	public static void main(String []argv)
	{
		double Num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number\n");
		Num = sc.nextDouble();
		
		System.out.println("SquareRoot of number = "+Math.sqrt(Num));
		System.out.println("CubeRoot of number = "+Math.cbrt(Num));
		
	}
}
