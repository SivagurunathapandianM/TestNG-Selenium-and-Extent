package com.sampleproject.mavenSampleProject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        App(args);   
    }
    
    private static void App(String[] args) 
    {
		LOG.info("FirstName: "+args[0]);
		LOG.info("LastName: "+args[1]);
		
	}
}
