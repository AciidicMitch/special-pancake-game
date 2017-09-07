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
			int lines = 0;
			Scanner scan = new Scanner(wordBank);
			while (scan.hasNextLine()) {
				//String line = scan.toString();
				//System.out.println(scan.toString());
				if(scan.nextLine() == null){
					break;
				}
				else{lines++;}
            }
			System.out.println("yooo");
			int selectedWord = (int)(Math.random() *lines) + 1;
			System.out.println(selectedWord + " is the index location");
			lines = 0;
			while(true) {
                //String line = scan.toString();
				if(lines == selectedWord){
					word = scan.nextLine();
					break;
				}
				System.out.println(lines);
				lines++;
            }
			
		} catch (FileNotFoundException e){e.printStackTrace();}
		
		return word;
	} 
	
	
}
 