
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String secretword = "WHY";

		
		Guessing guess = new Guessing(secretword);
		
		
		//Currently for testing if word has been selected.
		System.out.println(guess.checker());
		System.out.println(guess.guesserThing());
		//guess.checker();
		
	}

}
