package stepGlue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepDef {
	WebDriver driver;
	@When("Larry searches for products in the search field")
	public void larry_searches_for_products_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		for(String plist:pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver .findElement(By .xpath("/html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
		}
		

	@Then("Larry verifies the product availability")
	public void larry_verifies_the_product_availability() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	@Given("sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("Alex is existing customer")
	public void alex_is_existing_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("He has good purchase record with store")
	public void he_has_good_purchase_record_with_store() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Alex provides his mobile no")
	public void alex_provides_his_mobile_no() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Alex should get registration success")
	public void alex_should_get_registration_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@When("Sales executive provides {string} and {string} as credentials")
	public void sales_executive_provides_and_as_credentials(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys(string);
		driver.findElement(By .name("password")).sendKeys(string2);
		driver.findElement(By .name("Cancel")).click();
		driver.quit();
	
	
	}
	@Given("executive added items to the cart")
	public void executive_added_items_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("item price is calculated")
	public void item_price_is_calculated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("bill is generated with final amount")
	public void bill_is_generated_with_final_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}



	@Then("Login is successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	
	@Given("Alex purchased microwave for {int} dollars")
	public void alex_purchased_microwave_for_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Alex has a reciept")
	public void alex_has_a_reciept() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Alex returns the faulty microwave")
	public void alex_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Alex got refund of {int} dollars")
	public void alex_got_refund_of_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("user navigated to login page")
	public void user_navigated_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		LoginPage lp=new LoginPage(driver);
		lp.signin.click();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		LoginPage.username.sendKeys("Lalitha");
		LoginPage.password.sendKeys("password123");
		
	}

	@Then("user logged is successfully")
	public void user_logged_is_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
