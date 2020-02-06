package com.bit.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/*
web.xml
<listener>
	<listener-class>com.bit.config.MyListener</listener-class>
</listener>
*/

@WebListener
public class MyListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("WAS destroy...");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("WAS init...");
		
	}
	
}
