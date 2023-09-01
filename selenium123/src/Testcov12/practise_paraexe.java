package Testcov12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practise_paraexe 
{
	public WebDriver driver;
@Test
@Parameters({"browser"})
public void test1(String browser)
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	else
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
}
