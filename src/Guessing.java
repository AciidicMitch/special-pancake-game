import java.util.Scanner;


public class Guessing {

	Scanner scan = new Scanner(System.in);
	WordBank bank = new WordBank();
	
	
	private int lives;
	private String guess;
	private int lettersLeft;
	private String wordz = "TESTWORD";  //whyyyyyy problems
	private String currentAsteriskWord = null;
	private int count;
	
	
	public Guessing(String word, String secretWord){	
		wordz = word;
		currentAsteriskWord = secretWord;
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
//		for(int i = 0; i < wordz.length(); i++){
//			if(!wordz.contains(guess)){
//				count++;
//			}
//		}
		if (wordz.contains(guess)){		
//			currentAsteriskWord.update();
			StringBuilder asterick = new StringBuilder(currentAsteriskWord);
			char guezz = guess.charAt(0);
			for(int i = 0; i < wordz.length(); i++){
				char charRepl = wordz.charAt(i);
				if(charRepl == guezz)
				{					
					asterick.replace(i, i+1, guess);
					count ++;
				}
			}			
			lettersLeft = lettersLeft - count;
			System.out.println("That's correct. You have " + lettersLeft + " to guess.");
			//asterick.replace(wordz.indexOf(guess), wordz.indexOf(guess) + 1, guess);
			System.out.println(asterick);
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
