import java.util.Scanner;
import java.io.*;

public class WordBank {
	File wordBank = new File("words.txt");
	String word;
	String[] bank;
	String lineToRead;
	public String GetWord() throws IOException {
		if (word == null) {
			SelectWord();
		}

		return word;
	}

	private String SelectWord() throws IOException{
		//System.out.println("yooo");
		try {
			//System.out.println("yooo");
			int line = 0;
			Scanner scan = new Scanner(wordBank);
			LineNumberReader  lnr = new LineNumberReader(new FileReader(wordBank));
			while (scan.hasNextLine()) {
				//String line = scan.toString();
				//System.out.println(scan.toString());
				//String line = scan.next();
               // System.out.println(line);
				if(scan.nextLine() == null){
					break;
				}
				else{
					line++;
				}
            }
			//System.out.println("yooo");
			int selectedWord = (int)(Math.random() *line);
			System.out.println(selectedWord + 1 + " is the line number");
			while ((lineToRead = lnr.readLine()) != null)
	         {
				if(lnr.getLineNumber() == selectedWord+1){
					word = lnr.readLine();
					if(word == null){word = "NULLIFICATION";}
					break;
				}
	            //System.out.println("Line " + lnr.getLineNumber() + ": " + lineToRead);
	         }
			//lnr.setLineNumber(selectedWord);
			 
			System.out.println(word);
			scan.close();
			lnr.close();
		} catch (FileNotFoundException e){e.printStackTrace();}
		
		return word;
	}}
