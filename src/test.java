import java.util.*;
public class test {

	public static String[] words = {"computer", "ram", "monitor", "storage", "array", 
		"allocation", "analysis", "data", "truck", "duck", "muck", "puck", 
		"prestidigtaion" };

	private String secretWord = "what";
	private ArrayList<Character> correctLetters;
	private ArrayList<Character> incorrectLetters;
	private Scanner stdin = new Scanner(System.in);
	
	public test() {
		this.secretWord = "miscellaneous";
		this.correctLetters = new ArrayList<Character>();
		for (int i = 0; i < this.secretWord.length(); i++)
			this.correctLetters.add('_');
		this.incorrectLetters = new ArrayList<Character>();
	}	
	
	public void playGame() {
		while (!gameOver()) {
			printHangman();
			for (int i = 0; i < this.correctLetters.size(); i++)
				System.out.print(this.correctLetters.get(i) + " ");
			
			System.out.print("\nWrong letters: ");
			for (int i=0; i < this.incorrectLetters.size(); i++)
				System.out.print(this.incorrectLetters.get(i) + " ");
				
			System.out.print("\nEnter a lower-case letter as your guess: ");
			String guess = stdin.nextLine();
			
			handleGuess(guess.charAt(0));
		}
		
		System.out.println("The secret word was: " + secretWord);
		if (gameWon()) {
			System.out.println("Congratulations, you won!");
		} else {
			System.out.println("Sorry, you lost.");
			printHangman();
		}
	}
	
	private void handleGuess(char ch){
		
	}
	private boolean gameWon() {
		return true;
	}
	private boolean gameLost(){
		return true;
	}
	private boolean gameOver(){
		return true;
	}
	
	private void printHangman(){
		int poleLines = 6;
		System.out.println("  ____");
		System.out.println("  |  |");
	
	int badGuesses = this.incorrectLetters.size();
	if (badGuesses == 7){
			System.out.println("  |  |");
			System.out.println("  |  |");
	}
	if (badGuesses > 0){
			System.out.println("  |  O");
			poleLines = 5;
			}
	if (badGuesses > 1){
		poleLines = 4;
		if (badGuesses == 2){
			System.out.println("  |  |");
		} else if (badGuesses == 3){
			System.out.println("  | \\|");
		} else if (badGuesses >=4){
			System.out.println("  | \\|/");
		}
	}
	if (badGuesses > 4){
		poleLines = 3;
		if (badGuesses == 5){
			System.out.println("  | /");
		} else if(badGuesses >= 6){
			System.out.println("  | / \\");
		}
	}
	if (badGuesses == 7){
		poleLines = 1;
	}
	for (int k=0; k < poleLines; k++){
			System.out.println("  |");
	}
	
}
}
