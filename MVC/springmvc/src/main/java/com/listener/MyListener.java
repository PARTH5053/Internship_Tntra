package com.listener;

import java.util.ArrayList;
import javax.validation.constraints.NotNull;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.Theinfo;

public class MyListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Created....");
		List<Theinfo> list=new ArrayList<Theinfo>();
		ServletContext context=sce.getServletContext();
		context.setAttribute("list", list);
		
	}

}
