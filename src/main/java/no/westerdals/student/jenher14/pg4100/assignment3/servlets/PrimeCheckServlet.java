package no.westerdals.student.jenher14.pg4100.assignment3.servlets;

import no.westerdals.student.jenher14.pg4100.assignment3.util.NumberHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.Arrays;

@WebServlet(name="PrimeCheck", urlPatterns="/PrimeCheck")
public class PrimeCheckServlet extends HttpServlet
{
    private static final Logger errorLogger = LogManager.getLogger("Errors");
    private static final Logger requestLogger = LogManager.getLogger("Requests");

    @Override
    public void doGet (HttpServletRequest req, HttpServletResponse resp)
    {
        String number = req.getParameter("number");

        if (number != null)
        {
            int n = NumberHelper.getNumber(number);
            String error = null;
            String info = null;
            if (n == -2)
                error = "Please write a valid number over 1.";

            else if (n == -1)
                error = "A prime number cannot be 1 or less.";

            else
            {
                boolean isPrime = NumberHelper.isPrime(n);

                info = n + " is ";
                if (!isPrime)
                    info += "not ";
                info += "a prime number!";
            }

            requestLogger.info("A user checked " + number);

            req.setAttribute("error", error);
            req.setAttribute("info", info);
        }

        RequestDispatcher view = req.getRequestDispatcher("PrimeCheck.jsp");

        try { view.forward(req, resp); }
        catch (Exception e) { errorLogger.error(e.getClass().getName() + " \n" + Arrays.toString(e.getStackTrace())); }
    }
}