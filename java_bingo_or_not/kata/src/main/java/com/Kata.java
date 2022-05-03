package com;

public class Kata 
{
    private static boolean includesBingo(int[] numberArray)
    {
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
