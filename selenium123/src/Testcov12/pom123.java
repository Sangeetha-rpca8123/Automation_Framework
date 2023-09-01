package Testcov12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom123 
{
@FindBy(name="email")
private WebElement etbox;
@FindBy(name="pass")
private WebElement ptbox;
@FindBy(name="login")
private WebElement logbox;

public pom123(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void email1(String un) 
{
	etbox.sendKeys(un);
}
public void pass1(String pwd)
{
	ptbox.sendKeys(pwd);
}
public void login1()
{
	logbox.click();
}
	
}
