package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest 
{
    @Test
    public void bingoWorksWithBingoNumbers()
    {
        // These numbers correspond with alphabet eg 2 = b, 9 = i, 14 = n
        int[] numbersWithBingo = {2, 9, 14, 7, 15, 1, 1, 1, 1, 1};
        int[] tenOnes = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals("WIN", Kata.bingo(numbersWithBingo));
        assertEquals("LOOSE", Kata.bingo(tenOnes));
    }
}
