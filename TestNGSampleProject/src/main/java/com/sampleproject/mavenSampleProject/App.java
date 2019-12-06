package com.sampleproject.mavenSampleProject;


import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
    	String[] name = {"Sivagurunathapandian","Murugan"};
        System.out.println( "Hello World!" );
        App(name);   
    }
    
    private static void App(String[] args) 
    {
		LOG.info("FirstName: "+args[0]);
		LOG.info("LastName: "+args[1]);
		
			String appConfigPath = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",appConfigPath);
		      WebDriver driver = new FirefoxDriver();
		      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		      //Launch website
		    //  driver.navigate().to("http://www.calculator.net/");
		      
		      /*//Maximize the browser
		      driver.manage().window().maximize();
		      
		      // Click on Math Calculators
		      driver.findElement(By.xpath(".//*[@id = 'menu']/div[3]/a")).click();
		      
		      // Click on Percent Calculators
		      driver.findElement(By.xpath(".//*[@id = 'menu']/div[4]/div[3]/a")).click();
		      
		      // Enter value 10 in the first number of the percent Calculator
		      driver.findElement(By.id("cpar1")).sendKeys("10");
		      
		      // Enter value 50 in the second number of the percent Calculator
		      driver.findElement(By.id("cpar2")).sendKeys("50");
		      
		      // Click Calculate Button
		      driver.findElement(By.xpath(".//*[@id = 'content']/table/tbody/tr[2]/td/input[2]")).click();

		      
		      // Get the Result Text based on its xpath
		      String result =
		         driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/font/b")).getText();

		      
		      // Print a Log In message to the screen
		      System.out.println(" The Result is " + result);*/
		      
		      //Close the Browser.
		      driver.get("http://zb-control.sco-dev.caas.swissre.com/swagger-ui.html#!/");
		      driver.manage().window().setSize(new Dimension(1550, 838));
		      driver.findElement(By.linkText("Workflow")).click();
		      driver.findElement(By.linkText("/listWorkflows")).click();
		      driver.findElement(By.cssSelector("#Workflow_listWorkflows_content .submit")).click();
		      driver.close();
		
	}
}
