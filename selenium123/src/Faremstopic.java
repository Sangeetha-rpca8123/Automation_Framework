import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faremstopic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("iframe[@id='frame1']"));
		driver.switchTo().frame(ele);
		WebElement ele1 = driver.findElement(By.id("sampleHeading"));
		
		String a = ele1.getText();
		System.out.println(a);
		

	}

}
