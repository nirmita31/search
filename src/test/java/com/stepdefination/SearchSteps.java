package com.stepdefination;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps extends Base {
	
	SearchPage sp;
	
	@Given("User is on amazon homepage")
	public void user_is_on_amazon_homepage() {
		getdriver();
		sp=PageFactory.initElements(driver, SearchPage.class);
	   
	}

	@When("User enter the item on search field {string}")
	public void user_enter_the_item_on_search_field(String string) {
		sp.getSearchField(string);
		 
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		//sp.getSearchIcon();
		 
	}

	@Then("user on search page")
	public void user_on_search_page() {
		
		//Assert.assertEquals(sp.SearchItemPage.getText(), "\"Qa testing\"");
	   
	}

}
