package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom456 
{
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchtxt;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchicon;
	@FindBy(xpath="//div[text()='APPLE iPhone 11 (White, 128 GB)']")
		private WebElement tvimg;
	@FindBy(xpath="//button[text()='Buy Now']")
	private WebElement addcart;
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeord;
	@FindBy(xpath="//button[text()='Change']")
	private WebElement chang;
	@FindBy(xpath="//span[text()=' 577522']")
	private WebElement radio;
	public pom456(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void enter(String name)
	{
		searchtxt.sendKeys(name);
		
	}
	public void search()
	{
	searchicon.click();
	}
	public void samsung()
	{
		tvimg.click();
	}
	public void addcart1()
	{
		addcart.click();
	}
public void place()
{
	placeord.click();
}
public void address()
{
	chang.click();
}
public void select()
{
	radio.click();
}
}
