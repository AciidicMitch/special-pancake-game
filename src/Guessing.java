import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	WordBank bank = new WordBank();
	
	
	private int lives;
	private String guess;
	private int lettersLeft;
	private String word = "TESTWORD";  //whyyyyyy problems
	private String currentAsteriskWord = "* testing";
	private int count;
	
	
	public Guessing(String word){	
		this.word = word;
//		word = bank.GetWord();
		word = "TESTWORD"; //delete when functional
//		currentAsteriskWord.create();
		lives = 10;	
		lettersLeft = word.length();
	}
	
	public String checker(){
		if(lives < 1){
			return "You are out of lives";
		}
		System.out.println("What is your guess?");
		guess = scan.nextLine();
		guess.toUpperCase();
		lives--;
		return (guess);
	}
	
	public boolean guesserThing(){
		for(int i = 0; i < word.length(); i++){
			if(!word.contains(guess)){
				count++;
			}
		}
		if (!word.contains(guess)){		
			lettersLeft = lettersLeft - count;
			System.out.println("That's correct. You have " + lettersLeft + " to guess.");
//			currentAsteriskWord.update();
			System.out.println(currentAsteriskWord);
			count = 0;
			return true;
		}
		else{
			System.out.println("FAIL");
			return false;
		}
		
		//if (lives > 0){
		//	checker();
		//}
	}
	
	
	public String getWord(){
		return word;		
	}
	
	public String toString(){
		return "You have " + lettersLeft + " letters left and " + lives + " lives.";
	}
	
}
