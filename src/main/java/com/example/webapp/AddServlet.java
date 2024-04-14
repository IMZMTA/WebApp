package com.example.webapp;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet",initParams = {
        @WebInitParam(name = "name", value = "Nazish")
})
public class AddServlet extends HttpServlet {

//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        int i = Integer.parseInt(req.getParameter("num1"));
//        int j = Integer.parseInt(req.getParameter("num2"));
//
//        int k = i + j;
//        PrintWriter out = res.getWriter();
//
//        out.println("Result : " + k);
//        System.out.println("Result : " + k);
//
//    }
    //instead of service we can use doGet(fetch) or doPost(send) which will be beneficial


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        PrintWriter out = res.getWriter();

//        out.println("Result : " + k);
//        System.out.println("Result : " + k);


        //RequestDispatcher
//        req.setAttribute("k",k);

//        RequestDispatcher rd = req.getRequestDispatcher("SqServlet");
//        rd.forward(req,res);

        //SendRe-direct   Process - >Url Rewriting Other ways are(session management and cookies);
//        res.sendRedirect("SqServlet?k=" + k);

        //Session Management
//        HttpSession session = req.getSession();
//        session.setAttribute("k",k);
//
//        res.sendRedirect("SqServlet");

        //Cookies Management
//        Cookie cookie = new Cookie("k",k + "");
//        res.addCookie(cookie);
//
//        res.sendRedirect("SqServlet");

        //ServletConfig
        ServletConfig cg = getServletConfig();
        String str = cg.getInitParameter("name");
        out.println("<html><body bgcolor='cyan'>");
        out.println("Config : " + str + "</br>");

        //ServletContext
        ServletContext ctx = getServletContext();
        String st = ctx.getInitParameter("name");
        out.println("Context : " + st);
        out.println("</body></html>");

    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        PrintWriter out = res.getWriter();

        req.setAttribute("k",k);

        out.println("Result : " + k);
        System.out.println("Result : " + k);

    }

}