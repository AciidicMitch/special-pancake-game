import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	WordBank bank = new WordBank();
	
	
	private int lives;
	private String guess;
	private int lettersLeft;
	private String word;  //whyyyyyy problems
	
	
	public Guessing(String word){
		
		word = bank.GetWord();
		this.word = word;
		lives = 10;	
		lettersLeft = word.length();
	}
	public String checker(){
		System.out.println("What is your guess?");
		guess = scan.nextLine();
		boolean pass = false;
		return (guess);
// MAKING CHECKER FOR VALID???		
		
	}
	
	public boolean guesserThing(){
		if (word.contains(guess)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public String getWord(){
		return word;		
	}
	
	public String toString(){
		return "You have " + lettersLeft + " letters left and " + lives + " lives.";
	}
	
}
