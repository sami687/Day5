package Day5;
import java.util.Scanner;  

public class largestThreenumbers {
	public static void main(String args[])  
	{  
		int number1, number2, number3;  
		System.out.println("Enter three integers: ");  
		Scanner three = new Scanner(System.in);  
		number1=three.nextInt();  
		number2=three.nextInt();  
		number3=three.nextInt(); 
		three.close();

		if (number1 > number2 && number1 > number3)  
			System.out.println("The largest number is: "+number1);  
		else if (number2 > number1 && number2 > number3)  
			System.out.println("The largest number is: "+number2);  
		else if (number3 > number1 && number3 > number2)  
			System.out.println("The largest number is: "+number3);  
	}  
}
