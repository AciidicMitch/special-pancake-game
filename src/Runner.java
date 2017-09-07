import java.io.IOException;


public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String word = new WordBank().GetWord();
		String[] secretWord = new String[word.length()];
		
		for(int i = 0; i < word.length(); i++)
		{
			secretWord[i] = "*";
		}
		
		Guessing guess = new Guessing(word, secretWord);
		//Currently for testing if word has been selected.
		System.out.println(guess.checker());
		System.out.println(guess.guesserThing());
		//guess.checker();
		
	}

}
