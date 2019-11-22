# Summary

* selenium (E2E UI testing) is a tool to automate web application testing : URL https://selenium.dev/ 
* RestAssured : Testing and validating REST services in Java
* TestNG is testing framework to faciliate selenium to use organised way of testing
* extent report is a reporting framework to be integrated with selenium for graphical respresentation. 
```text
					URL : http://extentreports.com/docs/versions/4/java/	
						  http://extentreports.com/community/
```
* jacoco :
* Sonarlint
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

# Basic structure of testNG xml file:
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


# SonarQube,
 
docker pull sonarqube 
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
docker run -d -p 9000:9000 sonarqube -Dhttp.proxyHost=http://gate-zrh-os.swissre.com -Dhttp.proxyPort=8080

To configure proxy in sonarQube:
https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/

