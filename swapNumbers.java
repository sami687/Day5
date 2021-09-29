package Day5;
import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {
		int num1, num2, box;
		Scanner swap = new Scanner(System.in);  
		System.out.println("Enter the value of num1 and num2:");  
		num1 = swap.nextInt();  
		num2 = swap.nextInt(); 
		swap.close();
		System.out.println("before swapping numbers: "+num1 +"  "+ num2);  

		box = num1;  
		num1 = num2;  
		num2 = box;  
		System.out.println("After swapping: "+num1 +"   " + num2);  
		System.out.println( );  
	}
}
