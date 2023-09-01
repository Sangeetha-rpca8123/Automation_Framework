package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delettopic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele=driver.findElement(By.xpath("//body"));
		boolean b =ele.isDisplayed();
		if(b)
		{
			System.out.println("is displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		

	}

}
