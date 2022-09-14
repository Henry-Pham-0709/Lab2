<%-- 
    Document   : arithmeticcalculator
    Created on : Sep. 13, 2022, 8:49:11 p.m.
    Author     : phamh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <div>
                <label>First: </label>
                <input type="text" name="first" id="first" value="<%= request.getAttribute("firstNum") %>">
            </div>
            <div>
                <label>Second: </label>
                <input type="text" name="second" id="second" value="<%= request.getAttribute("secNum") %>">
            </div>
            <div>
            <input type="submit" name="calc" value="+">
            <input type="submit" name="calc" value="-">
            <input type="submit" name="calc" value="*">
            <input type="submit" name="calc" value="%">
            </div>
            
            <p>Result: <%= request.getAttribute("result") %></p>
            <a href="." target="target">Age Calculator</a>
        </form>
    </body>
</html>
