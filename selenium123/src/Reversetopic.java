import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reversetopic {

	public static <WebEelement> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/reverstopic.html");
		List<WebElement>checkbox=driver.findElements(By.xpath("//input"));
		int count=checkbox.size();
		System.out.println(count);
		for(WebElement  b:checkbox)
		{
			b.click();
			
		}
for(int i=count-1;i>=0;i--)
{
	WebElement a=checkbox.get(i);
	a.click();
}
	}

}

