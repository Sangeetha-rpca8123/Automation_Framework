package selenium123;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Emptyfirefoxlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.quit();
		
	}

}
