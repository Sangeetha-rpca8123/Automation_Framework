import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleabc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[3]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Picture for category Cell phones']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='page-body']/div[3]/div[2]/div[1]/div[1]/a/img")).click();
	}

}

