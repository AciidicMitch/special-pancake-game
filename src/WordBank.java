import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class WordBank {
	File wordBank = new File("words.txt");
	String word;
	String[] bank;
	
	public String GetWord(){
		if(word == null){
			SelectWord();
		}
		
		return word;
	}
	
	private String SelectWord(){
		try {
			int lines = 0;
			Scanner scan = new Scanner(wordBank);
			while (scan.hasNextLine()) {
                //String line = scan.toString();
				System.out.println(scan.toString());
                lines++;
            }
			
		} catch (FileNotFoundException e){e.printStackTrace();}
		
		return word;
	} 
	
	
}
