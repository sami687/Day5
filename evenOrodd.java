package Day5;
import java.util.Scanner;

public class evenOrodd {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int num = obj.nextInt();
		obj.close();

		if(num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
}
}
