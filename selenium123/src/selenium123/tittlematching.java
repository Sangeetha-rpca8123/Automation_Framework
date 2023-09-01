package selenium123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tittlematching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equals("hello world"))
		{
			System.out.println("tc is pass");
		}
		else
		{
			System.out.println("tc id fail");
		}

	}

}
