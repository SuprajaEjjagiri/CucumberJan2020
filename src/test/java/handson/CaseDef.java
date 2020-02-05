package handson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepGlue.DriverUtil;

public class CaseDef {
	WebDriver driver;
	@Given("user login to TestMeApp")
		public void user_login_to_TestMeapp() {
			driver=DriverUtil.getDriver("chrome");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
			driver.manage().window().maximize();
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		}
	
	@When("user provides {string} and {string} as credentials")
	public void user_provides_and_as_credentials(String string,String string2)
	{
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys("admin");
		driver.findElement(By .name("password")).sendKeys("Password456");
		driver.findElement(By .name("Login")).click();
		
	}
	@Then("login is succesfull")
	public void login_is_succesfull() {
		System.out.println("Login is successfull");
		
		
	}
	@Given("user adds a new category")
		public void user_adds_a_new_category() {
		
	}
	@When("user add category name as")
	public void user_adds_category_name_as(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By .xpath("//h4[text()='Add Category']")).click();
		driver.findElement(By .name("catgName")).sendKeys("Sports");
		driver.findElement(By .name("catgDesc")).sendKeys("add sports category");
		driver.findElement(By .name("Add")).click();
	}
	@Then("user adds the subcategory under sports category")
	public void user_adds_the_subcategory_under_sports_category(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By .className("className")).click();
		driver.findElement(By .name("catname")).sendKeys("Sports");
		driver.findElement(By .name("subCatgName")).sendKeys("Basketball");
		driver.findElement(By .name("subCatgDesc")).sendKeys("basketball");
	}
}
