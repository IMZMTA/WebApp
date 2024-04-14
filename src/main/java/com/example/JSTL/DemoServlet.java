package com.example.JSTL;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "DemoServlet", value = "/DemoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = "Navin";

        Student s = new Student(1,"Nazish");

        List<Student> studs = Arrays.asList(new Student(2,"Tausif"),new Student(3,"Saif"),new Student(4,"Sohail"));

        request.setAttribute("label",name);
        request.setAttribute("student",s);
        request.setAttribute("studs",studs);

        RequestDispatcher rd = request.getRequestDispatcher("/JSTL/Display.jsp");

        rd.forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}