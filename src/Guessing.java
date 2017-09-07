import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	WordBank bank = new WordBank();
	
	
	private int lives;
	private String guess;
	private int lettersLeft;
	private String wordz = "TESTWORD";  //whyyyyyy problems
	private String currentAsteriskWord = "* testing";
	private int count;
	
	
	public Guessing(String word, String[] secretWord){	
		wordz = word;
//		word = bank.GetWord();
//		word = "TESTWORD"; //delete when functional
//		currentAsteriskWord.create();
		lives = 10;	
		lettersLeft = wordz.length();
	}
	
	public String checker(){
		if(lives < 1){
			return "You are out of lives";
		}
		System.out.println("What is your guess?");
		guess = scan.nextLine();
		guess = guess.toUpperCase();
		return (guess);
	}
	
	public boolean guesserThing(){
		guess = guess.toUpperCase();
		for(int i = 0; i < wordz.length(); i++){
			if(!wordz.contains(guess)){
				count++;
			}
		}
		if (wordz.contains(guess)){		
			lettersLeft = lettersLeft - count;
			System.out.println("That's correct. You have " + lettersLeft + " to guess.");
//			currentAsteriskWord.update();
			System.out.println(currentAsteriskWord);
			count = 0;
			return true;
		}
		else{
			System.out.println("FAIL");
			lives--;
			return false;
		}
		
		//if (lives > 0){
		//	checker();
		//}
	}
	
	public String toString(){
		return "You have " + lettersLeft + " letters left and " + lives + " lives.";
	}
	
}
