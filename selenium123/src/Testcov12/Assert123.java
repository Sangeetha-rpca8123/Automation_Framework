package Testcov12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert123 extends Generic123
{
	@Test
public void test1() throws InterruptedException
{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manage");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		//Assert.assertEquals(title, "facebook-log in@sign up");
		//System.out.println("1");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "telegram");
		System.out.println("hai");
		sa.assertAll();
		

}

}
