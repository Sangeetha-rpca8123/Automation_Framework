import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimaxitopic 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		Robot s=new Robot();
		s.keyPress(KeyEvent.VK_ALT);
		s.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		s.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		s.keyRelease(KeyEvent.VK_ALT);
		s.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		s.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
	}

}
