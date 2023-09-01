package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Xpathtopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
