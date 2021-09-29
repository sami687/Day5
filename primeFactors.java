package Day5;
import java.util.Scanner;

public class primeFactors {
	public static void main(String[] args) {
		int number;
		Scanner prime = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = prime.nextInt();
		prime.close();

		for(int i = 2; i< number; i++) {
			while(number%i == 0) {
				System.out.println(i+" ");
				number = number/i;
			}
		}
		if(number >2) {
			System.out.println(number);
		}
	}
}

