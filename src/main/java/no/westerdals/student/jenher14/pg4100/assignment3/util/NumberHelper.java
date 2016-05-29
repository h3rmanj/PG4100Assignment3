/*
 * Herman Jensen
 * PG4100
 * Innlevering 3
 */

package no.westerdals.student.jenher14.pg4100.assignment3.util;

import org.apache.commons.math3.primes.Primes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberHelper
{
    private static final Logger errorLogger = LogManager.getLogger("Errors");

    public static int getNumber (String n)
    {
        int number;

        try
        {
            number = Integer.parseInt(n);

            //Signaliserer at nummeret som ble skrevet inn ikke per definisjon kan være ett gyldig primtall
            if (number <= 1)
                number = -1;
        }
        catch (NumberFormatException nf)
        {
            //Signaliserer at det som ble skrevet inn ikke er ett tall
            errorLogger.error("Det ble ikke skrevet inn ett tall.", nf);
            number = -2;
        }

        return number;
    }

    public static boolean isPrime (int n)
    {
        return Primes.isPrime(n);
    }
}
