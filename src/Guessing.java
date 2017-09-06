import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	WordBank bank = new WordBank();
	
	
	private int lives;
	private String guess;
	private int lettersLeft;
	private String word = "TESTWORD";  //whyyyyyy problems
	
	
	public Guessing(String word){	
		this.word = word;
//		word = bank.GetWord();
		lives = 10;	
		lettersLeft = word.length();
	}
	
	public String checker(){
		System.out.println("What is your guess?");
		guess = scan.nextLine();
		return (guess);	
	}
	
	public boolean guesserThing(){
//MKAE THIS WORK
		if (word.contains(guess)){
			System.out.println("That's correct. You have " + lettersLeft + " to guess.");
			return true;
		}
		else{
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
