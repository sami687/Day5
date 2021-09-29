package Day5;
import java.util.Scanner;

public class quotientAndRemainder {

	public static void main(String[] args) {
		int number1, number2;
		Scanner num = new Scanner(System.in);

		System.out.println("Please Enter any number1: ");
		number1 = num.nextInt();
		System.out.println("Please Enter any number2: ");
		number2 = num.nextInt();
		num.close();

		System.out.println("Quotient = " + number1 /number2);
		System.out.println("Remainder = " + number1 % number2);	
	}
}
