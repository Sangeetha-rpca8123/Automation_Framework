import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(2000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dst = new File("C:\\Users\\Admin\\Pictures\\Screenshots\\popup.jpeg");
		Thread.sleep(2000);
		FileHandler.copy(src, dst);

	}

}
