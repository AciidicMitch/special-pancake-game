import java.io.IOException;


public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String word = new WordBank().GetWord();
		StringBuilder asterick = new StringBuilder(word);
		String secretWord = null;
		
		for(int i = 0; i < word.length(); i++)
		{
			asterick.replace(i, i, "_");
		}
		asterick.replace(word.length(), word.length()*2, "");
		secretWord = asterick.toString();
		System.out.println(word + " is the selected word, client will see " + secretWord + " until they guess a letter.");
		
		Guessing guess = new Guessing(word, secretWord);
		//Currently for testing if word has been selected.
		while(guess.lives > 0 || guess.lettersLeft == 0){
			guess.checker();
		}
	
		//guess.checker();
		
	}

}
