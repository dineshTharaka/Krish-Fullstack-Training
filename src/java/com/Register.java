/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
public class Register extends HttpServlet{

     public static User user= new User();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        
             String email=  req.getParameter("email");
        String password=  req.getParameter("password");
        String addres=  req.getParameter("addres");
         String name=  req.getParameter("name");
        System.out.println(email +""+ password);
        
        user.setName(name);
        user.setAddres(addres);
        user.setEmail(email);
        user.setPassword(password);
        
        resp.sendRedirect("index.jsp");
    }
    
}
