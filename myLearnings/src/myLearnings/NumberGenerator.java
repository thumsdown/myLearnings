package myLearnings;
import java.util.Scanner;
import java.util.Random;
public class NumberGenerator {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = 0;
		int RandomNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Random Number");
		number = sc.nextInt();
		RandomNumber = rd.nextInt(number);
		System.out.println("Random Number is ="+RandomNumber);
	}

}
