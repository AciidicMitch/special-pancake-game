import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	
	
	private int lives;
	private String word;
	private CharSequence guess;
	private int lettersLeft;
	
	public Guessing(String word){
		this.word = word;
		lives = 10;	
		lettersLeft = word.length();
	}
	
	public void checker(){
		word = scan.nextLine()
		boolean pass = false;
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
