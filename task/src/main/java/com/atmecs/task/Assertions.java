package com.atmecs.task;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	
//HARD Assertion(Once the assertion fails it does not goes to next set of statements)
		@Test(priority=1)
		public void test1()
		{
			Assert.assertTrue(true);//true
			Assert.assertEquals("windows", "Windows");//false
			Assert.assertEquals("Selenium", "Selenium");//true
			System.out.println("This is test 1");
		}

		//Soft assert (even though the assertion fails it continues to the next set of stments)
		SoftAssert softAssert=new SoftAssert();
		@Test(priority=0)
		public void test2()
		{
			softAssert.assertTrue(true);//true
			softAssert.assertEquals("windows", "Windows");//false
			softAssert.assertEquals("Selenium", "Selenium");//true
			System.out.println("This is test 2");
			softAssert.assertAll();
		}
		}

