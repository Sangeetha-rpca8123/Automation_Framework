package Testcov12;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 
{
	@Test(priority = 0)
public void data1()
{
	Reporter.log("hai",true);
}
	@Test
public void data2()
{
	Reporter.log("tata",true);
}
}
