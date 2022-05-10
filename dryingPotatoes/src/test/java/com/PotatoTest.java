package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PotatoTest
{
    @Test
    public void returnsPotato()
    {
        assertEquals("potato", Potato.potato());
    }
}
