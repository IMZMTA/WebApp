package com.example.Login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        HttpSession session = request.getSession();
        session.setAttribute("username",uname);

        if(uname.equals("Tausif")&& pass.equals("123")){
            String contextPath = request.getContextPath();
            System.out.println("Correct on a path : " + contextPath);
            response.sendRedirect(contextPath +"/AuthenLogInOut/Welcome.jsp");
        }
        else {
            response.sendRedirect("/WebApp/AuthenLogInOut/Login.jsp");
        }
    }

}