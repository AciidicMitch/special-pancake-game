
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("WEWZZZZZ");
		
		String secretword = "what";

		
		Guessing guess = new Guessing(secretword);
		
		
		//Currently for testing if word has been selected.
		System.out.println(guess.checker());
		
		//guess.checker();
		guess.guesserThing();
		
	}

}
