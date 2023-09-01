import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FORMTOPIC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sangeetha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("yadav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sang@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7019756381");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'15')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3'].")).sendKeys("pcmb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lable[@for='hobbies-checkbox-3']")).click();
		
		
		
	}

}
