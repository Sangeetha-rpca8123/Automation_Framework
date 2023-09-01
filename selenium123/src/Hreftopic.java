import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hreftopic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		 List<WebElement> img = driver.findElements(By.xpath("//img"));
		int count= img.size();
		System.out.println(count);
		for(WebElement b:img)
		{
			String t=b.getAttribute("src");
			System.out.println(t);
		}
		
	}

}
