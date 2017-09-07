import java.util.Scanner;
import java.io.*;

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
		System.out.println("yooo");
		try {
			System.out.println("yooo");
			int line = 0;
			Scanner scan = new Scanner(wordBank);
			while (scan.hasNextLine()) {
				//String line = scan.toString();
				//System.out.println(scan.toString());
				//String line = scan.next();
               // System.out.println(line);
				if(scan.nextLine() == null){
					break;
				}
				else{
					bank[line] = scan.next(); 	
					line++;
				}
            }
			System.out.println("yooo");
			int selectedWord = (int)(Math.random() *line) + 1;
			System.out.println(selectedWord + " is the index location");
			
			word = bank[selectedWord];    
			System.out.println(word);
			scan.close();
			
		} catch (FileNotFoundException e){e.printStackTrace();}
		
		return word;
	} 
	
	
}
 