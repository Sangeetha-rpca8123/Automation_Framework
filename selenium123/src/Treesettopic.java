import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treesettopic {
	
	

	public static void main(String[] args) {h7 0
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		TreeSet<String> t=new TreeSet<>(Collections.reverseOrder());
		Select l=new Select(ele);
		List<WebElement> opt = l.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement a:opt)
		{
			String b = a.getText();
			t.add(b);
			
		}
		
		for(String c:t)
		{
			System.out.println(c);
		}
if(t.contains("Sep"))
{
	System.out.println("is present");
}
else
{
	System.out.println("not present");
}
	}
	
	

}
