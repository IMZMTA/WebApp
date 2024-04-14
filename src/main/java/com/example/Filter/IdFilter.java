package com.example.Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "IdFilter", value = "/addAlien")
public class IdFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;

        int aid = Integer.parseInt(req.getParameter("aid"));

        PrintWriter out = response.getWriter();

        if(aid>0){
            System.out.println("In filter");
            chain.doFilter(request, response);
        }
        else {
            out.println("Invalid Input");
            System.out.println("Filtering cannot be done");
        }
    }
}