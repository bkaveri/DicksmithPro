package StepDef;

import java.util.List;

import org.openqa.selenium.WebElement;

import PageLocators.Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import runners.BaseClass;

public class LoginPage extends BaseClass {
	
	@Given("Iam on the url")
	public void iam_on_the_url() {
	    launch("https://www.dicksmith.com.au/");
	}
	@When("I enter iphone")
	public void i_enter_iphone() {
		Page p=new Page();
		pass(p.getSearch(),"iphone");
	}
@And("I click search button")
public void i_click_search_button() {
	Page p=new Page() ;
	cse(p.getBtn().get(0));
	
	

}
	
}

	
	
	
	
	
	
	
	
	

	






	
	



