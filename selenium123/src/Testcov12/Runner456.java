package Testcov12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner456 extends Generic123 
{
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.close();
	}
}
