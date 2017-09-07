import java.io.IOException;


public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String secretword = new WordBank().GetWord();
		
		
		Guessing guess = new Guessing(secretword);
		
		
		//Currently for testing if word has been selected.
		System.out.println(guess.checker());
		System.out.println(guess.guesserThing());
		//guess.checker();
		
	}

}
