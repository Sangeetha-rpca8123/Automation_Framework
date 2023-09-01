package Testcov12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner101 
{

	
	@Test
	public void click1() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pom123 p1=new pom123(driver);
		Thread.sleep(2000);
		p1.email1("admin");
		Thread.sleep(2000);
		p1.pass1("man"
				+ ""
				+ "ager");
		Thread.sleep(2000);
		p1.login1();
	}

}
