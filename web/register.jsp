<%-- 
    Document   : register
    Created on : Jan 27, 2022, 1:06:13 AM
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
             <form action="Register" method="post">
                <table>
                    <tr>
                        <th>Enter name :</th>
                        <td><input type="text" name="name"></td>
                    </tr><!-- < -->
                     <tr>
                        <th>Enter email :</th>
                        <td><input type="email" name="email"></td>
                     </tr>
                      <tr>
                        <th>Enter Addres :</th>
                        <td><input type="text" name="addres"></td>
                    </tr>
                     <tr>
                        <th>Enter password:</th>
                        <td><input type="password" name="password"></td>
                    </tr>
                     <tr>
                        <th></th>
                        <td><input type="submit" value="submit"></td>
                    </tr>
                </table>
                 <a href="index.jsp">Loging</a>
            </form>
    </body>
</html>
