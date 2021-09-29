package Day5;
import java.util.Scanner;

public class flipcoin {
	public static void main(String[] args) {
		Scanner coin = new Scanner(System.in);
		System.out.println("Enter number of flips:");
		int flips = coin.nextInt(); 
		coin.close();

		int head=0;
		int tail = 0;
		for(int i= 0 ; i< flips; i++) {
			double random  = ((double) (Math.random()*(1)));
			if(random < 0.5) {
				head+=1;
			}else {
				tail+=1;	
			}	
		}
		System.out.println("Head =" +( head * (100/flips)));
		System.out.println("Tail =" + (100- ( head * (100/flips) )));
	}
}


