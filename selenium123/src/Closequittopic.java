import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closequittopic 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Robot s=new Robot();
		Thread.sleep(2000);
		s.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		s.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		s.keyPress(KeyEvent.VK_C);
		s.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		s.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		s.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		
		
	}

}
