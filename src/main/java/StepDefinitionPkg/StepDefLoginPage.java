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

public class StepDefLoginPage extends BasePage
{

	public StepDefLoginPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public WebElement elem;
	
	public String givenUrl;
	
	private By EnterUsernameElem = By.xpath("//input[@placeholder='Email']");

	private By EnterpasswordElem = By.xpath("//input[@placeholder='Password']");

	private By LoginButtonElem = By.xpath("//div[contains(text(),'Login')]");
	
	@Given("User launch the Free CRM application")
	public void user_launch_the_free_crm_application() throws IOException 
	{
		givenUrl = PropertiesLoader.getProperties("baseurl");
		
		System.out.println("The actual Url is: "+givenUrl);
	}
	
	@When("User verify the current url")
	public void user_verify_the_current_url() 
	{
	 String currentUrl = testDriver.getCurrentUrl();
	        
	 System.out.println("The Entered Url: " +currentUrl);
	        
	 String expectedUrl = givenUrl;

	 if (currentUrl.equals(givenUrl)) 
	 {
	  System.out.println("Test Url and Current Url are validated");
	 }
	 else
	 {
	  Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);	
	 }	
	        	 
	}
	
	
	
	@Then("User enters Username {string} and Password {string}")
	public void user_enters_username_and_password(String GivenUsername, String Givenpassword) 
	{
	 	 elem = getWebElement(EnterUsernameElem);
	 	 
	 	 if(GivenUsername!=null)
	 	 {
	 	  try 
	 	  {
	 		 GivenUsername = PropertiesLoader.getProperties(GivenUsername);
		  } 
	 	  catch (IOException e) 
	 	  {
				e.printStackTrace();
		  }
	 	 }	 

	 	 elem.sendKeys(GivenUsername);
	 		
	 	 System.out.println("Enter Username is: "+GivenUsername);
	 	 
	 	 elem = getWebElement(EnterpasswordElem);
	 	 
	 	 if(Givenpassword!=null)
	 	 {
	 	  try 
	 	  {
	 		 Givenpassword = PropertiesLoader.getProperties(Givenpassword);
		  } 
	 	  catch (IOException e) 
	 	  {
				e.printStackTrace();
		  }
	 	 }	 
	 		
	 	 elem.sendKeys(Givenpassword);
	 		
	 	 System.out.println("Enter Password is: "+Givenpassword);
	}
	
	
	
	@Then("User click on Login button")
	public void user_click_on_login_button() 
	{
		 elem = getWebElement(LoginButtonElem);

		 elem.click();
		 
		 System.out.println("Click to Login Button");
	}
	
	
	
	@Then("Verify user lands on Free CRM Login Page")
	public void verify_user_lands_on_free_crm_login_page() 
	{
      String exptitle = "";
      
      String acttitle = testDriver.getTitle();
      
      System.out.println("Actual Page: "+acttitle);
      
      Assert.assertEquals(acttitle, exptitle,"Page title should matched");
	}
}
