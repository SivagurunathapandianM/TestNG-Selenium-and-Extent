package com.sampleproject.mavenSampleProject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.sampleproject.mavenSampleProject.App;
import org.junit.*;
import junit.framework.TestCase;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{   
	//builds a new report using the html template 
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test;
    

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
/*
    @Test(groups = { "Test1" })
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }
    */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
    
     
    @Parameters({ "OS", "browser" })
    @BeforeTest
    public void startReport(String OS, String browser) {
    	
    	System.out.println("Going to create report");
    	// initialize the HtmlReporter
    	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    	
    //	File file =new File("./test-output/ExtentReports/ExtentDemoReport"+timeStamp+".html");
    	File file =new File("./test-output/ExtentReports/ExtentDemoReport.html");
    	System.out.println("File"+file);
//    	htmlReporter = new ExtentHtmlReporter(file);
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/ExtentReports/ExtentDemoReport.html");
       
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
        //To add system or environment info by using the setSystemInfo method.
        extent.setSystemInfo("OS", OS);
        extent.setSystemInfo("Browser", browser);
        
        //configuration items to change the look and feel
        //add content, manage tests etc
      
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
     
    @Test(groups = { "Test2" })
    public void test_method_2() {
    
    	System.out.println("Extentextent : "+extent);
        test = extent.createTest("testmethod to excute main method", "PASSED test case");
    	System.out.println("Extenttest : "+test);
    	App app = new App();  
    	String[] name = {"Sivagurunathapandian","Murugan"};
    	app.main(name);
        System.out.println("@Test - test_method_2");
        
    }
   
    @Test(description="This is testcase2")  
    public void testcase2()  
    {  
    test = extent.createTest("testcase2Decription", "PASSED test case");
    System.out.println("Software Developer");  
    Reporter.log("Browser is opened");
    }  
    
    @Test
    public void testCase1() {
        test = extent.createTest("Test Case 1", "PASSED test case");
        Assert.assertTrue(true);
    }
    @Test
    public void testCase5() {
        test = extent.createTest("Test Case 5", "SKIPPED test case");
        throw new SkipException("Skipping this test with exception");
    }
    @Test
    public void testCase6() {
        test = extent.createTest("Test Case 6", "PASSED test case");
        Assert.assertTrue(false);
    }
    
    @AfterMethod
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
    @AfterTest
    public void afterTest() {
    	extent.flush();
        System.out.println("afterTest");
    }
     
    @AfterSuite
    public void afterSuite() {
         System.out.println("afterSuite");
    }
    
    
}
