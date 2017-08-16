package training;

public class boolMethod {

	
	
	//private static boolean gameOver = true;
	
	
   public static void main (String[] args){
	
		boolean gameOver;
		int gp;
		int hp;
		int mp;
	
   checkGame(true, 100, 55,25);	

	}
	
	public static void checkGame(boolean gameOver, int gp, int hp, int mp){
		
		if(gameOver){
			
			System.out.println("You have " + gp + "gp, " + hp +"hp, and " + mp+ "mp.");
			
			
		}
		
		
	}
	
}
