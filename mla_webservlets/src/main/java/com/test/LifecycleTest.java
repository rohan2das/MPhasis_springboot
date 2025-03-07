package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
//import javax.servlet.GenericServlet;
//import javax.servlet.Servlet;


@WebServlet("/LifecycleTest")
public class LifecycleTest extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public LifecycleTest() {
        
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
	}


	public void destroy() {
		System.out.println("destroy()");
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("preocessing req and res");
	}

}
