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

public class Upcastingtopic 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		ArrayList<WebElement> l=new ArrayList<>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		l.add(ele5);
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		Robot b=new Robot();
		
		Thread.sleep(2000);
		for (WebElement l1 : l) 
		{
			
			a.contextClick(l1).perform();
			Thread.sleep(2000);
			b.keyPress(KeyEvent.VK_T);
			b.keyRelease(KeyEvent.VK_T);
		}
		Set<String> wh = driver.getWindowHandles();
		Thread.sleep(2000);
		ArrayList<String> wh1=new ArrayList<>(wh);
		Thread.sleep(2000);
		
		String z = wh1.get(1);
		driver.switchTo().window(z);
		
		
	}

}
