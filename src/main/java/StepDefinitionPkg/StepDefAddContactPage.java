package StepDefinitionPkg;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BasePkg.BasePage;
import UtilityPkg.PropertiesLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefAddContactPage extends BasePage
{

	public StepDefAddContactPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public WebElement elem;
	
	public String givenUrl;
	
	private By ClickAddContactElem = By.xpath("//span[contains(text(),'Contacts')]");

	private By ClickAddTaskElem = By.xpath("//span[contains(text(),'Tasks')]");

	private By ClickAddDealElem = By.xpath("//span[contains(text(),'Deals')]");
	
	private By ClickLogOutElem = By.xpath("//span[contains(text(),'Log Out')]");

	private By ClickSettingElem = By.xpath("//input[@placeholder='Password']");

	

}
