package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="SignIn")
	public static WebElement signin;
   
	@FindBy(name="userName")
	public static WebElement username;
 
	@FindBy(name="password")
	public static WebElement password;
	  
	@FindBy(how=How.NAME,using="Login")
	public static WebElement loginbtn;

}
