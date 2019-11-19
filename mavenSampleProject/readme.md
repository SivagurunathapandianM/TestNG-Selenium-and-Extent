# Summary

* selenium is a tool to automate web application testing 
* TestNG is testing framework to faciliate selenium to use organised way of testing
* extent report is a reporting framework to be integrated with selenium for graphical respresentation 


[Sample testNG Project](https://www.javarticles.com/2015/02/example-of-testng-configuration-xml-testng-xml.html#prettyPhoto)
[TestNG Project with MavenBuild](https://howtodoinjava.com/testng/how-to-execute-testng-tests-with-maven-build/)
[Including group in the testNG.xml file](https://www.javatpoint.com/testng-groups)

["Extent" Report Generator](https://www.seleniumeasy.com/selenium-tutorials/creating-extent-reports-in-selenium-example)
[Advance Extent Report Project](https://www.seleniumeasy.com/selenium-tutorials/extent-reports-using-testng-listeners)
[Selenium Java Youtube link](https://www.youtube.com/playlist?list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa)



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
