package martingale;
import java.util.*;


public class lottery {

	
	public static void main (String[] args){
		
		Random rand = new Random();
		int money = 0;
		int odds=0;
	
		
		do {
			odds = rand.nextInt(84000);
			System.out.print(odds + " \t" + money +" \n");
		money++;

		
		}
		while ( odds != 1);
		
		
	}
	
	
}
