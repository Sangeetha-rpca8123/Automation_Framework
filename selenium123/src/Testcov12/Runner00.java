package Testcov12;

import org.testng.annotations.Test;
@Test(groups = {"functional"})
public class Runner00 
{
	@Test(groups = {"sanity"})
public void test1()
{
	System.out.println("compose");
}
	@Test(groups = {"regression"})
	public void test2()
	{
		System.out.println("sent");
	}
	@Test(groups = {"sanity","regression"})
	public void test3()
	{
		System.out.println("trash");
	}
}
