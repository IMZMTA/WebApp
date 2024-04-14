package com.example.Filter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addAlien", value = "/addAlien")
public class addAlien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        int aid = Integer.parseInt(request.getParameter("aid"));
        String uname = request.getParameter("uname");

        out.println("Welcome : " + uname);

    }

}