import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class closeparenttopic 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://skpatro.github.io/demo/links/");
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(rclick).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		WebElement rclick2 = driver.findElement(By.xpath("//a[text()='हिन्दी']"));
		Actions act1=new Actions(driver);
		Thread.sleep(2000);
		act1.contextClick(rclick2).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_T);
		r1.keyRelease(KeyEvent.VK_T);
		Set<String> wh = driver.getWindowHandles();
		
		for (
				String wh1 : wh) 
		{
			
			driver.switchTo().window(wh1);
			Thread.sleep(2000);	
		}
	}

}
