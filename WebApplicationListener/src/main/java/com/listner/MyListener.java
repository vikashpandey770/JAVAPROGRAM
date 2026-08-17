package com.listner;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
@WebListener
public class MyListener implements ServletContextListener {
      public void contextInitialized(ServletContextEvent sce)  { 
  System.out.println("context Initialized");
  sce.getServletContext().getAttribute("counter");
  
  
      }
    public void contextDestroyed(ServletContextEvent sce)  { 
  
    System.out.println("context Destroyed");
    sce.getServletContext().getAttribute("counter");
    	
    }
	
}
