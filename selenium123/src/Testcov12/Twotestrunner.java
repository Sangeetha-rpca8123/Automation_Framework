package Testcov12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Twotestrunner extends Generic123
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manage");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.close();
	}
}
