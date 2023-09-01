import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontopic 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.myntra.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes");
Thread.sleep(2000);
driver.findElement(By.className("desktop-submit")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='search-searchProductsContainer row-base']/section/ul[1]/li[2]/a/div[1]/div[1]/div[1]/div[1]/picture/img")).click();

	}
	

}
