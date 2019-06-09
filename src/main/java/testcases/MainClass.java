package testcases;

import org.testng.TestNG;

public class MainClass {

	public static void main(String[] args) {
		
		
		TestNG testSuite = new TestNG();
		testSuite.setTestClasses(new Class[] { SandBoxSetUp.class });
		//testSuite.addListener(new TestSuiteListener());
		//testSuite.setDefaultSuiteName("My Test Suite");
		//testSuite.setDefaultTestName("My Test");
		//testSuite.setOutputDirectory("/Users/pankaj/temp/testng-output");
		testSuite.run();
	}



	}


