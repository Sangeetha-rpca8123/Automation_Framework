package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys("class");
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("and");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("button[type='submit']")).click();
				
	}

}
