package testng;

import org.testng.annotations.Test;

public class test {
	@Test(groups="regression")
	public void test1()
	{
		System.out.println("browser load");
	}
	@Test(groups="smoke")
	public void test2()
	{
		System.out.println("find element");
	}
	@Test(groups="regression")
	public void test3() 
	{
		System.out.println("find https");
	}
	@Test(groups="smoke")
	public void test4()
	{
	System.out.println("count of list");	
	}

}
