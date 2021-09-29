package Day5;

import java.util.Scanner;

public class harmonicNumber {
	public static void main(String[] args) {
		int number;
		Scanner value = new Scanner(System.in);
		System.out.println("Please Enter value N: ");
		number = value.nextInt();
		value.close();
		for(int i=1 ; i <= number ; i++) {
			System.out.println("Harmonic number 1/" + i);
		}
	}
}