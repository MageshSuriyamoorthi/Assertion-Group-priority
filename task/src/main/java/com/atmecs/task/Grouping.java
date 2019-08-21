package com.atmecs.task;

import org.testng.annotations.Test;

public class Grouping {

	@Test(priority=2,groups="windows.sanity")
	public void test1()
	{
		System.out.println("This is test 1");
	}
	@Test(groups= {"sanity","regression"})
	public void test2()
	{
		System.out.println("This is test 2");
	}
	@Test(priority=0,groups= {"sanity","regression","smoke"})
	public void test3()
	{
		System.out.println("This is test 3");
	}
	@Test(groups= {"windows.sanity","smoke","regression"})
	public void test4()
	{
		System.out.println("This is test 4");
	}
	@Test(priority=1,groups= {"windows.sanity","smoke","regression"})
	public void test5()
	{
		System.out.println("This is test 5");
	}
}
