package training;

public class game {
	
	public static void main (String[] args){
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("your score is " + highScore);
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
	}

	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		
		if(gameOver){
		int finalScore = score + (levelCompleted * bonus);
		finalScore = finalScore + 2000;
				;
		return finalScore;
		}
		return -1;
	}

}
