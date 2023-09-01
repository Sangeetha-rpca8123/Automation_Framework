import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countritopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/contri.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("countries"));
		
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("j");
		Thread.sleep(2000);
		s.selectByVisibleText("russia");
		Thread.sleep(2000);
		
	}

}
