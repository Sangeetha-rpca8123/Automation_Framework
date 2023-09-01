package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlemaptopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@id='searchboxinput']")).sendKeys("banglore,karnataka");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span [@class='google-symbols Cw1rxd']")).click();
		
		//driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='sb_ifc51']")).click();
		//driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("xyz");
		

	}

}
