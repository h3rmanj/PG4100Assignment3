package no.westerdals.student.jenher14.pg4100.assignment3.util;

import org.apache.commons.math3.primes.Primes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class NumberHelper
{
    private static final Logger errorLogger = LogManager.getLogger("Errors");

    public static int getNumber (String n)
    {
        int number;

        try
        {
            number = Integer.parseInt(n);
            if (number <= 1)
                number = -1;
        }
        catch (NumberFormatException nf)
        {
            errorLogger.error("NumberFormatException \n" + Arrays.toString(nf.getStackTrace()));
            number = -2;
        }

        return number;
    }

    public static boolean isPrime (int n)
    {
        return Primes.isPrime(n);
    }
}
