package com.test;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


//@WebFilter("/Admin")
public class MyFilter extends HttpFilter implements Filter {
       

	public void destroy() {
		System.out.println("destroy()");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("before servlet execution in doFilter()");
		
		chain.doFilter(request, response);
		
		System.out.println("after servlet execution in doFilter()");

	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init()");
	}

}
