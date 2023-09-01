import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Asserttopic extends Generic123
{
@Test
public void test1()
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manage");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
}
}
