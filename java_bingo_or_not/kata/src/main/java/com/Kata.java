package com;

public class Kata 
{
    private static String convertNumToAlpha(int num)
    {
        return "a";
    }
    private static boolean includesBingo(int[] numberArray)
    {   
        convertNumToAlpha(numberArray[0]);
        return false;
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
