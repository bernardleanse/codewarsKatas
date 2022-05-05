package com;
import java.util.ArrayList;

public class Kata 
{
    private static String convertNumToLetter(int num)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.substring(num - 1, num);
    }
    private static ArrayList<String> getLetterList(int[] nums)
    {
        ArrayList<String> letters = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++)
        {
            letters.add(convertNumToLetter(nums[i]));
        }
        return letters;
    }

    private static boolean listContainsLetter(String letter, ArrayList<String> list)
    {
        return list.contains(letter);
    }

    private static boolean includesBingo(int[] numberArray)
    {   
        String[] requiredCharsForBingo = {"b", "i", "n", "g", "o"};
        ArrayList<String> letters = getLetterList(numberArray);

        for (int i=0; i<requiredCharsForBingo.length; i++)
        {
            if (listContainsLetter(requiredCharsForBingo[i], letters) == false)
            {
                return false;
            }
        }
        return true;
    }
    public static String bingo(int[] numberArray)
    {
        if( includesBingo(numberArray) )
        {
            return "WIN";
        };

        return "LOOSE";
    }
}
