<%-- 
    Document   : index
    Created on : Jan 27, 2022, 1:02:31 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form  action="loging" method="post">
            <table>
                 <tr>
                <td>Enter Email :</td>
                <td><input type="email" name="email"></td>
            </tr>
             <tr>
                <td>Enter password :</td>
                <td><input type="password" name="password"></td>
            </tr>
             <tr>
                <td></td>
                <td><input type="submit" value="Loging"></td>
            </tr>
            </table>
             <a href="register.jsp">Registation</a>
        </form>
    </body>
</html>
