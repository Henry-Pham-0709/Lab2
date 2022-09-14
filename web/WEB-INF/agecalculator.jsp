<%-- 
    Document   : agecalculator
    Created on : Sep. 12, 2022, 12:33:15 p.m.
    Author     : phamh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <label>Enter your age: </label>
            <input type="text" name="age" id="age">
            <div>
            <button type="submit">Age next birthday</button>
            </div>
        </form>
        <%if (request.getAttribute("age") != null) { %>
        Your age next birthday will be <%= request.getAttribute("age") %>
        <% } %>
        
        <% if(request.getAttribute("message") != null) { %>
        <%= request.getAttribute("message") %>
        <% } %>
        <div><a href="arithmetic" target="target">Arithmetic Calculator</a></div>
    </body>
</html>
