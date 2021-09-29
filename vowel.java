package Day5;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your character : ");
		char letter = obj.next().toCharArray()[0];
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || 			letter == 'I' || letter == 'O' || letter == 'U' ) {

			System.out.println("It is vowel");
		}else {
			System.out.println("It is consonant");
		}
	}
}
