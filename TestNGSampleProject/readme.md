# Summary

* selenium (E2E UI testing) is a tool to automate web application testing :
			 URL: https://selenium.dev/, https://selenium.dev/downloads/   
```text
		Selenium webdriver  : Selenium WebDriver drives a browser natively, as a real user would, either locally or on remote machines.
		Selenium IDE		: Selenium IDE is a Chrome and Firefox extension that makes it easy to record and playback tests in the browser.
		Selenium Grid		: Selenium Grid takes WebDriver to another level by running tests on many machines at the same time, cutting down on the time it takes to test on multiple browsers and operating systems.
		FireBug and FirePath : 
		Firebug is a free and open source Web Browser extension or developer tool for Mozilla Firefox. This can be used to debug and edit any web application opened in the browser.
		
		
		http://testingpool.com/usage-of-developer-tools-firebug-and-firepath/
		
		
Copied Selenium standalone server in the src/test/resources folder:
	- (java -jar selenium-server-standalone-3.141.59.jar), Command is used to Run selenium standalone server
```

* RestAssured:
```text
       (http://rest-assured.io/) : Testing and validating REST services in Java
		https://github.com/rest-assured/rest-assured/wiki/GettingStarted
		https://www.journaldev.com/21501/rest-assured-tutorial
```
  
* TestNG is testing framework to faciliate selenium to use organised way of testing
* extent report is a reporting framework to be integrated with selenium for graphical respresentation. 
```text
					URL : http://extentreports.com/docs/versions/4/java/	
						  http://extentreports.com/community/
```
* jacoco :
* Sonarlint : https://www.tatvasoft.com/blog/introduction-to-sonarqube-sonarlint/
* SonarQube, URL :https://dzone.com/articles/sonarqube-scanning-in-15-minutes-2



Rest API : https://www.tutorialspoint.com/rest_api_automation_with_rest_assured/index.asp  

[Sample testNG Project](https://www.javarticles.com/2015/02/example-of-testng-configuration-xml-testng-xml.html#prettyPhoto)
[TestNG Project with MavenBuild](https://howtodoinjava.com/testng/how-to-execute-testng-tests-with-maven-build/)
[Including group in the testNG.xml file](https://www.javatpoint.com/testng-groups)

["Extent" Report Generator](https://www.seleniumeasy.com/selenium-tutorials/creating-extent-reports-in-selenium-example)
[Advance Extent Report Project](https://www.seleniumeasy.com/selenium-tutorials/extent-reports-using-testng-listeners)
[Selenium Java Youtube link](https://www.youtube.com/playlist?list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa)

* Unit Test - Running zeebe inside your JVM itself or test container next to JUnit/TestNG whatever. Deploy workflow, start workflow, consume service messages and validate all the steps/services works as expected with this.
* Integration Testing - Deploy workflow into actual dev/test environment, stat workflow, let actual micro service to pickup and execute the task, assess the report.
* Smoke Testing - We just run success case from Integration Testing
* Performance Testing - Deploy Test Workflow into performance/test env and use Jmeter to produce workload. We may need to see, we want to use actual micro services to test the worker load or we would deploy test worker nodes as well.

# Basic structure of testNG xml file
```xml
<suite>
	<test>
		<classes>
			<class name="ClassPath" />
		</classes>
	</test>
	<test>
		<groups>
			<define name="mavenTest">
				<include name="Test1" />
				<include name="Test2" />
			</define>
			<run>
				<include name="mavenTest" />
			</run>
		</groups>
		<classes>
			<class name="com.sampleproject.mavenSampleProject.AppTest" />
			<methods>
				<include name="test_method_3" />
			</methods>
		</classes>
	</test>
</suite>
```
* Groups are specified in the testng.xml file with <groups> tag. Groups can be specified either in the <suite> tag or <test> tag. If the <groups> tag is specified inside the <suite> tag, then it is applied to all the <test> tags of XML file. If the <groups> tag is specified within a particular <test> folder, then it is applied to that particular <test> tag only.

*
|TestNG Annotation 	| Description |
| :------------     |:---------------:| 
|@BeforeSuite 		| The @BeforeSuite annotated method will run before the execution of all the test methods in the suite.|
|@AfterSuite 		| The @AfterSuite annotated method will run after the execution of all the test methods in the suite.|
|@BeforeTest 		| The @BeforeTest annotated method will be executed before the execution of all the test methods of available classes belonging to that folder.|
|@AfterTest 	   	| The @AfterTest annotated method will be executed after the execution of all the test methods of available classes belonging to that folder.|
|@BeforeClass 		| The @BeforeClass annotated method will be executed before the first method of the current class is invoked.|
|@AfterClass 		| The @AfterClass annotated method will be invoked after the execution of all the test methods of the current class.|
|@BeforeMethod 		| The @BeforeMethod annotated method will be executed before each test method will run.|
|@AfterMethod 		| The @AfterMethod annotated method will run after the execution of each test method.|
|@BeforeGroups 		| The @BeforeGroups annotated method run only once for a group before the execution of all test cases belonging to that group.|
|@AfterGroups 		| The @AfterGroups annotated method run only once for a group after the execution of all test cases belonging to that group.|


# TestNG Annotation Attributes

* description
* timeOut
* priority
* dependsOnMethods
* enabled
* groups

# TestNG Parameter and listeners


# SonarQube
 
docker pull sonarqube 
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
docker run -d -p 9000:9000 sonarqube -Dhttp.proxyHost=http://gate-zrh-os.swissre.com -Dhttp.proxyPort=8080

To configure proxy in sonarQube:
https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/

Gobal Setting:
```xml
<settings>
    <pluginGroups>
        <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
    </pluginGroups>
    <profiles>
        <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <!-- Optional URL to server. Default value is http://localhost:9000 -->
                <sonar.host.url>
                  http://myserver:9000
                </sonar.host.url>
            </properties>
        </profile>
     </profiles>
</settings>
```



**SonarQube** is a server where you can host your projects and execute analysis, 
whereas **SonarLint** is an agent that allow us to connect with this SonarQube and execute the analysis remotely. SonarLint can be used with IDE or can also be executed via CLI commands.

SonarLint contains its own set of default rules but when connected to SonarQube, users can import rules from SonarQube which are actually more than just standard set of rules. We can integrate PDM, CodeStyle and many other checker on SonarQube and create custom rules.

Two facts i want to mentioned that i learnt from my experience, SonarLint will not inherit those custom rules from SonarCube, secondly Sonar does not work on Test classes.

# Rest Assured 
 
 * REST Assured is a Java Domain Specific Language API for simplifying testing of RESTful web services. REST Assured API can be used to invoke REST web services and match response content to test them.
 * REST Assured supports POST, GET, PUT, DELETE, OPTIONS, PATCH, and HEAD requests and can be used to validate and verify the response of these requests.
 * JSON Server : https://www.journaldev.com/10660/json-server
 * XML Based project : https://www.journaldev.com/498/jersey-java-tutorial,  https://www.journaldev.com/498/jersey-java-tutorial
 
 
# Include sample Azure Pipeline yaml file with the project 

 Path : src/test/resources
 
 
 
 
 
