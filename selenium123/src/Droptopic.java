import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droptopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		 WebElement ele = driver.findElement(By.id("day"));
		 Select s=new Select(ele);
		 Thread.sleep(2000);
		List<WebElement> opt = s.getOptions();
		int count=opt.size();
		System.out.println(count);
		 
	}
	
}
