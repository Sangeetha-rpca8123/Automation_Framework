package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoootopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://login.yahoo.com/?.src=ym&pspid=2023538075&activity=ybar-mail&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Fpspid%3D2023538075%26activity%3Dybar-mail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sagargd07@yahoo.com");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("sgd@141518");
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@role='button']")).click();

driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("sagargd07@yahoo.com");
	driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("haii");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("how r u");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	
	}
}
 
