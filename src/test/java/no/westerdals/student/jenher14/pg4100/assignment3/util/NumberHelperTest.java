package no.westerdals.student.jenher14.pg4100.assignment3.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Herman on 17.04.2016.
 */
public class NumberHelperTest {

    @Test
    public void testGetNumberReturnsErrorCodes () throws Exception
    {
        assertEquals(-2, NumberHelper.getNumber("abc"));
        assertEquals(-1, NumberHelper.getNumber("-51"));
    }

    @Test
    public void testIsPrimeReturnsTrueIfPrime () throws Exception
    {
        assertTrue(NumberHelper.isPrime(3));
    }

    @Test
    public void testIsPrimeReturnsFalseIfNotPrime () throws Exception
    {
        assertFalse(NumberHelper.isPrime(4));
    }
}