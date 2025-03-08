package com.test;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;


@WebListener
public class MyListener implements HttpSessionListener {

	
	public static int tUsers, cUsers =0;
	public static ServletContext ctx;
	
    public void sessionCreated(HttpSessionEvent se)  { 

    	tUsers++;
    	cUsers++;
    	
    	ctx = se.getSession().getServletContext();
    	ctx.setAttribute("total", tUsers);
    	ctx.setAttribute("current", cUsers);
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
         cUsers--;
         ctx.setAttribute("current", cUsers);
    }
	
}
