
package martingale;


import java.util.*;

public class n {

	
	public static void main (String [] args) {
		
		
		
		
		double money = 100000;
		int trades = 0;
		int prob = 0;
	
				
		double wager = 50;
		
		double finalwager =50;
		
		
		Random rand = new Random();
		
		
		System.out.println("MARTINGALE STRATEGY INITIATED:    55% EDGE");
		
		do {
			
			prob = rand.nextInt(100)+1;
			
			if (money >= 1000000)
			{
				System.out.print("CONGRATS! YOU REACHED $1,000,000");  
			
			break;
			}
			
	
			
			
			if(prob >= 40)
			{
				money = money + wager;
				wager = finalwager;
			   
			
			}
			else
			{
				money = money - wager;
				wager = wager * 2 ;

				
				
				
				}
			
		trades++;
		
		int days = trades/100;
		System.out.println( "$" + (Math.floor(money * 100) / 100) + "  trades: " + trades + "  \t" + "days " + days + "\n");
		
		if(money <= 0){
			System.out.println("RUIN");
		break;
		}
		} while (money >=0);
		
		
		
	}
	
	
}
