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
public class loging extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
          String email=  req.getParameter("email");
        String password=  req.getParameter("password");
         System.out.println(email);
        User u = Register.user;
        System.out.println(u.getEmail());
        
        if(email.equals(u.getEmail()) ){
            System.out.println("hi");
        resp.sendRedirect("home.html");
        }else{
            System.out.println("oi");
        resp.sendRedirect("loging.html");
        }
       
        
        
        
    }
    
}
