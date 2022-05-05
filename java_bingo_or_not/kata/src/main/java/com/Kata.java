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
    private static boolean includesBingo(int[] numberArray)
    {   
        ArrayList<String> letters = getLetterList(numberArray);
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
