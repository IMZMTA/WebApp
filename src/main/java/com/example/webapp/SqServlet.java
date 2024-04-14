package com.example.webapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SqServlet", value = "/SqServlet")
public class SqServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // RequestDispatcher
//        PrintWriter out = response.getWriter();
//
//        int k = (int) (request.getAttribute("k"));
//
//        out.println("Hello to Square : " + k*k);

        //SendRedirect - Url Rewriting
//        System.out.println("SqServlet Called");
//        PrintWriter out = response.getWriter();
//
//        int k = Integer.parseInt(request.getParameter("k"));
//
//        out.println("Hello to Square : " + k*k);


        //Session Management
//        HttpSession session = request.getSession();
//
//        int k = (int) session.getAttribute("k");
//
//        System.out.println("SqServlet Called");
//        PrintWriter out = response.getWriter();
//
//        out.println("Hello to Square : " + k*k);

        //Cookie Management
        int k =0;
        Cookie cookie[] = request.getCookies();

        for(Cookie c : cookie){
            if(c.getName().equals("k")){
                k = Integer.parseInt( c.getValue());
            }
        }

        System.out.println("SqServlet Called");
        PrintWriter out = response.getWriter();

        out.println("Hello to Square : " + k*k);

    }


}