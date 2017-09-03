using System;

public class WordBank
{
    var bankFile = Path.Combine(Directory.GetCurrentDirectory(), "\\words.txt");
    System.IO.StreamReader wordBank = new System.IO.StreamReader(bankFile);

[   ContentPropertyAttribute("Text")]
    
    private WordBank() // only this class needs to write to or use the word bank, if you need to get the words, use GetWordBank()
    {
        //oh no now i do the thing
        while ((line = bankFile.ReadLine()) != null)
        {
            Console.WriteLine(line);
            counter++;
        }
        Console.ReadKey();
    }

    public static string GetWordBank()
    {
        WordBank();
        return "Done!";
    }

    public static string SelectWord()
    {
        string word = "zee";
        return word;
    }

    public static voice Main(string[] args)
    {
        WordBank returnBank = new WordBank.GetWordBank();
        returnBank();
    }

}

