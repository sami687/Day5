package Day5;

import java.util.Scanner;

public class powerOfTwo {

	public static void main(String[] args) {
		int powerN;
		Scanner two = new Scanner(System.in);
		System.out.println("Please Enter Power value N: ");
		powerN = two.nextInt();
		two.close();

		if(powerN < 32) {
			for(int i=0 ; i <= powerN ; i++) {

				System.out.println("Table of power of two : " + (int) Math.pow(2,i));
			}
		}else {

			System.out.println("Enter value of N upto 31");

		}

	}										  	

}
