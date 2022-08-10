package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductDetailsPage;
import pages.SearchPage;
import tests.TestBase;

public class UserSearch extends TestBase {
		
	SearchPage srch;
	ProductDetailsPage deatails;
	String productName = "Apple MacBook Pro 13-inch"; 
	
	@Given("the user in home page.")
	public void the_user_in_home_page() {
	
		//Assert.assertTrue(driver.getCurrentUrl().contains("Welcome to our store"));
	}
	@When("I click on serach text box and enter the product that i search on it.")
	public void i_click_on_serach_text_box_and_enter_the_product_that_i_search_on_it() {
	  srch = new SearchPage(driver);
	  srch.ProductSearch(productName);
	
	}
	@When("see product deatails")
	public void see_product_deatails() {
		srch = new SearchPage(driver);
		deatails = new ProductDetailsPage(driver); 
		srch. OpenProductDetailsPage();
		Assert.assertEquals(deatails.productNamebreadCrumb.getText(), productName);
	}
	@Then("close the browser.")
	public void close_the_browser() {
		//driver.quit();
	}
}
