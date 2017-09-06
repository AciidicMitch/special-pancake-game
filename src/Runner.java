
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("WEWZZZZZ");
		
		String secretword = "what";
		WordBank bank = new WordBank();
		
		Guessing guess = new Guessing(secretword);
		
		System.out.println(guess);
	}

}
