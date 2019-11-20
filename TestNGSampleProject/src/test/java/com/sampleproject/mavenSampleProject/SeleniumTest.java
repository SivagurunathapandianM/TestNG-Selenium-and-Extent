package com.sampleproject.mavenSampleProject;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class SeleniumTest {
                
                public static void main(String args[]) throws InterruptedException{
                								System.out.println("Selenium Process is executed");
                                                WebDriver driver = new FirefoxDriver();
                                                //WebDriver driver = new InternetExplorerDriver();
                                                driver.manage().window().maximize();
                                                
                                                System.setProperty("webdriver.gecko.driver", "\\H:\\geckodriver.exe");
                                                Thread.sleep(3000);
                                                String ENV = "https://swissretest.service-now.com";
                                                //System.setProperty("webdriver.ie.driver", "\\H:\\IEDriverServer.exe");
                                                
                                                driver.get(ENV);
                                                Thread.sleep(10000);
                                                driver.findElement(By.id("filter")).sendKeys("i want to");
                                                Thread.sleep(5000);
                                                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Security Operations Catalog'])[1]/following::div[4]")).click();
                                                Thread.sleep(5000);
                                                driver.switchTo().frame("gsft_main");
                                                //driver.findElement(By.id("sysparm_catalog_search")).click();
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver,10);
            WebElement SearchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sysparm_catalog_search")));
            
            
           
           //driver.findElement(By.xpath("//*[contains(text(),'IT items for temporary use')]")).click();
           driver.findElement(By.id("sysparm_catalog_search")).sendKeys("Version control system (SVN) Password reset");
           driver.findElement(By.id("sysparm_catalog_search")).sendKeys(Keys.ENTER);
           Thread.sleep(5000);
           //driver.switchTo().frame("gsft_main");
           driver.findElement(By.xpath("//*[contains(text(),'Version control system (SVN) Password reset')]")).click();
           driver.findElement(By.id("item_link_dbae3a1b6f60b140cde14c992e3ee4c7")).click();
           Thread.sleep(5000);
           
           Select opt = new Select(driver.findElement(By.id("IO:086e325b6f60b140cde14c992e3ee408")));
           opt.selectByVisibleText("SVN");
           Select opt2 = new Select(driver.findElement(By.id("IO:a8eca3176f24b140cde14c992e3ee403")));
           opt2.selectByVisibleText("Password resend");
           
           driver.findElement(By.id("oi_order_now_button")).click();
           driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys("CHR5XXXX");
           //driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys(Keys.TAB);
           
           
       
           
          
        /*   
           
           String defaultWindow = driver.getWindowHandle();
           System.out.println(defaultWindow);
           Set<String> childWindows = driver.getWindowHandles();
                  
                   Iterator<String> iterator = childWindows.iterator();
                  
                   while(iterator.hasNext()){
                                   String child = iterator.next();
        
                                   if(!child.equalsIgnoreCase(defaultWindow)){
                                                   driver.switchTo().window(child);
                                                   System.out.println("Child windows- "+child);
                                   } else {
                                                   System.out.println("There are no child windows");
                                   }
                  }
                   
                   driver.findElement(By.xpath("//*[contains(text(),'CHR5XXXX')]")).click();
                   driver.switchTo().window(defaultWindow);
        */ 
           
        
           String winHandleBefore = driver.getWindowHandle();
           System.out.println(winHandleBefore);
           
           driver.findElement(By.id("lookup.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).click();
           Thread.sleep(3000);
           // Switch to new window opened
           for(String winHandle : driver.getWindowHandles()){
               driver.switchTo().window(winHandle);
               System.out.println(winHandle);
           }

           
           //driver.findElement(By.xpath("//*[@sys_id=def163310a0a8c0d0156b8197a1f200d]")).click();
           driver.findElement(By.xpath("//*[@class='glide_ref_item_link']")).click();
           
           
           //driver.quit();

           
          // driver.switchTo().window(driver.getWindowHandle());
           //driver.switchTo().window(winHandleBefore);
          // System.out.println(winHandleBefore);
           
           //driver.switchTo().frame("gsft_main");

           
       /*
           driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys(Keys.BACK_SPACE);
           Thread.sleep(10000);
           driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys("X");
           Thread.sleep(10000);
           
           driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys(Keys.DOWN);
           driver.findElement(By.id("sys_display.QUERY:owned_byISNOTEMPTY^sys_class_name=u_cmdb_ci_laptop^ORsys_class_name=u_cmdb_ci_desktop^ORsys_class_name=u_persclient_vm_instance^nameISNOTEMPTY^operational_statusIN5,6^ORu_hw_asset_statusINStaging,Deployed,Loaner Deployed")).sendKeys(Keys.ENTER);
       */  
           Thread.sleep(5000);
           
           for(String winHandle : driver.getWindowHandles()){
               driver.switchTo().window(winHandle);
               System.out.println(winHandle);
           }
           
          
           
           
           
           WebDriverWait waitForWindow = new WebDriverWait(driver,10);
           WebElement WindowSwitch = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("special_instructions")));
           
           
           //driver.switchTo().frame("gsft_main");
           
           driver.findElement(By.id("special_instructions")).sendKeys(Keys.CLEAR);
           
           driver.findElement(By.id("special_instructions")).sendKeys("Autotest001");
           
           
           driver.findElement(By.id("submit_order")).click();
           
           WebDriverWait waitForRequest = new WebDriverWait(driver,10);
           WebElement FetchRequest = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'REQ')]")));
           //driver.switchTo().frame("gsft_main");
           
           String REQNumber = driver.findElement(By.xpath("//*[contains(text(),'REQ')]")).getText();
           System.out.println(REQNumber);
           
           
           //driver.findElement(By.xpath("//*[contains(text(),'SVN')]")).click();
           //driver.findElement(By.id("IO:a8eca3176f24b140cde14c992e3ee403")).click();
           //driver.findElement(By.xpath("//*[contains(text(),'Password resend')]")).click();
           
           // driver.findElement(By.xpath("//input[@class='scSearchInput']")).sendKeys('Version control');
           for(String winHandle : driver.getWindowHandles()){
               driver.switchTo().window(winHandle);
               System.out.println(winHandle);
           }
           
            //WebElement REQelement = driver.findElement(By.xpath("//*[@class='input-group-addon-transparent icon-search sysparm-search-icon']"));
                                                //REQelement.click();
                                                //driver.findElement(By.id("sysparm_search")).sendKeys(REQNumber);
                                                //Thread.sleep(5000);
                                                //driver.findElement(By.id("sysparm_search")).sendKeys(Keys.ENTER);
           
                                                                                                                                                                                                                                                  //By.id("some_id")));
           
           
           
            driver.findElement(By.xpath("//*[contains(text(),'REQ')]")).click();
                                                Thread.sleep(5000);
                                                driver.switchTo().defaultContent();
                                                driver.switchTo().frame("gsft_main");
                                                Thread.sleep(3000);
                                                
                                                //driver.findElement(By.id("sys_display.sc_request.assigned_to")).sendKeys(Keys.PAGE_DOWN);
                                                //driver.findElement(By.id("sys_display.sc_request.assigned_to")).sendKeys(Keys.PAGE_DOWN);
                                                
                                                
                                                //driver.findElement(By.id("sc_request.u_deployment_catalog.name")).sendKeys(Keys.PAGE_DOWN);
                                                
                                /*           JavascriptExecutor js = (JavascriptExecutor) driver;
                                                WebElement RITMView = driver.findElement(By.xpath("//*[contains(text(),'RITM')]"));
                                                js.executeScript("arguments[0].scrollIntoView();", RITMView);
                                */           
                                                String RITMNumber = driver.findElement(By.xpath("//*[contains(text(),'RITM')]")).getText();
                                                
                                                
                                                driver.findElement(By.xpath("//td//a[contains(text(),'RITM')]")).click();
                                                
                                                Thread.sleep(5000);
                                                
                                                System.out.println(RITMNumber.substring(25));
                                                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                                                LocalDateTime now = LocalDateTime.now();
                                                System.out.println(dtf.format(now));
                                                
                                                String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                                                
                                                Thread.sleep(5000);
                                                System.out.println("****************************");
                                                System.out.println("Implicit wait is in progress : ");
                                                LocalDateTime now2 = LocalDateTime.now();
                                                System.out.println(dtf.format(now2));
                                                System.out.println("****************************");
                                                driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
                                                System.out.println("****************************");
                                                System.out.println("Explicit wait is in progress : ");
                                                LocalDateTime now3 = LocalDateTime.now();
                                                System.out.println(dtf.format(now3));
                                                System.out.println("****************************");
                                                WebDriverWait waitForProxy = new WebDriverWait(driver,50000);
                         WebElement ProxyTrigger = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'BPM - Proxy Workflow triggered successfully')]")));
                         System.out.println("Explicit wait completed");
                                                
                                                driver.findElement(By.xpath("//span[contains(text(),'BPM - Proxy Workflow triggered successfully')]"));
                                                System.out.println("Proxy has been successfully triggered. Validated Proxy test for "+RITMNumber.substring(25)+" : ");
                                                LocalDateTime now4 = LocalDateTime.now();
                                                System.out.println(dtf.format(now4));
                                                
                                                
                                                
                                                
           
                                   driver.quit();
                                   System.out.println("Test has been completed");
                                                //element.click();
                                                
                                                
                                                
                }

}
