package AdvanceBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	@BeforeSuite
	public void beforeSuite() {//database connection
		
		System.out.println("Before Suite");
	}
@BeforeTest	
public void beforeTest() {//the pre-condition for test runner
		
		System.out.println("Before Test");
	}
@BeforeClass
public void beforeClass() {//logic for pre-condition of test case
	
	System.out.println("Before Class");
}

@BeforeMethod	
public void beforeMethod() {//logics for login
		
		System.out.println("Before Method");
	}

@Test	
public void testCase1() {
		
		System.out.println("Test Case1");
	}

@Test	
public void testCase2() {
		
		System.out.println("Test Case2");
	}

@AfterMethod	
public void afterMethod() {//logics for logout
		
		System.out.println("After Method");
	}

@AfterClass
public void afterClass() {//logic for post-condition of test case
	
	System.out.println("After Class");
}
@AfterTest	
public void afterTest() {//the post-condition for test runner
		
		System.out.println("After Test");
	}
@AfterSuite
public void afterSuite() {//database disconnect
	
	System.out.println("After Suite");
}



}
