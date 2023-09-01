import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopagetopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/computing-and-internet']/../../div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Fiction')]/../../div[3]/div[2]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]/../../td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Fiction')]/../../td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
	}

}
