package selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
		
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		WebDriverWait wait=WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains("Submit"));
		
		
		
		

	}

	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	}

}
