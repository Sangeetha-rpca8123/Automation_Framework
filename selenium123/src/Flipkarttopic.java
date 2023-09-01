import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkarttopic {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("kurtha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div[2]/div[1]/div[3]/div[1]/a/div[1]/div[1]/div[1]/div[1]/img")).click();
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l= new ArrayList<String>(allwh);
	String s = l.get(1);
	driver.switchTo().window(s);
	driver.findElement(By.id("swatch-1-size")).click();
	Thread.sleep(2000);
	WebElement al = driver.findElement(By.xpath("//button[@class='_2KpZ6l "
			+ ""
			+ "_1t_O3S _2ti6Tf _3f2XG4 _3AWRsL']"));
	Thread.sleep(3000);
	Point bl = al.getLocation();
	int a = bl.getX();
	int b = bl.getY();
	js.executeScript("window.scrollBy("+a+","+b+")");
	al.click();
	}
}
