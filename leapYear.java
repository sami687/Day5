package Day5;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		int year;
		int Count =0;
		Scanner leap = new Scanner(System.in);
		
		System.out.println("Please Enter any year: ");
		year = leap.nextInt();
		int validyear = year;
		while(validyear > 0) {
			validyear = validyear / 10;
			Count = Count + 1; 
		}
		if(Count == 4) {
		
		if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
			System.out.println("is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}

		}else {
		
				System.out.println("Enter four digit year and run program again");
		}
	
	
	}

}
