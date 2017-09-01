using System;

public class WordBank
{
    var bankFile = Path.Combine(Directory.GetCurrentDirectory(), "\\words.txt");
    System.IO.StreamReader wordBank = new System.IO.StreamReader(bankFile);

    private WordBank() // only this class needs to write to or use the word bank, if you need to get the words, use GetWordBank()
    {
        //oh no now i do the thing
    }

    public static string SelectWord()
    {
        string word = "zee";
        return word;
    }
}
