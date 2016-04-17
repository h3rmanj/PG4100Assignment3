<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>PrimeCheck</title>
        <meta charset="UTF-8">
    </head>

    <body>
        <h2>Check if a number is a prime number!</h2>
        <br>
        <form action="PrimeCheck" method="GET">
            <input name="number" type="number" min="2" autofocus>
            <input type="submit" value="Check Number">
        </form>
        <br>
        <% if (request.getAttribute("error") != null) { %>
            <h3 style="color:red"><%= request.getAttribute("error")%></h3>
        <% } %>
        <% if (request.getAttribute("info") != null) { %>
            <h3><%= request.getAttribute("info")%></h3>
        <% } %>
    </body>
</html>
