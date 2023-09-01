package Test_script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic_script.generic456;
import pom_script.pom456;

public class runner456 extends generic456
{
@Test
public void test5() throws InterruptedException
{
	Thread.sleep(3000);
	pom456 p2=new pom456(driver);
	Thread.sleep(4000);
	p2.enter("iphone11");
	Thread.sleep(4000);
	p2.search();
	Thread.sleep(4000);
	p2.samsung();
	Thread.sleep(3000);
	p2.addcart1();
	Thread.sleep(4000);
	p2.place();
	Thread.sleep(4000);
	
	p2.address();
	Thread.sleep(4000);
	p2.select();
}

}
