package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest 
{
    @Test
    public void bingoWorksWithBingoNumbers()
    {
        int[] numbers = {2, 9, 14, 7, 15, 1, 1, 1, 1, 1};
        assertEquals("WIN", Kata.bingo(numbers));
    }
}
