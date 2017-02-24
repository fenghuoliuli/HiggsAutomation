package com.inmind.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class TestLogger {
	public static Logger getLogger (Class<?> testClass)   
	{      // Create a logger using the fully qualified class name as logger name  
		String logFilePath=System.getProperty("user.dir")+"/log";;
		Logger logger = Logger.getLogger (testClass.getName());  // Add a file handler that uses a HTML formatter     
		Handler handler;
		try {
			handler = new FileHandler (logFilePath);
			logger.addHandler(handler);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//handler.setFormatter(new HtmlFormatter(logTitle));  

		return logger; 
	}

}
