package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {
	
	public WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement searchField;
	public void getSearchField(String s) {
		searchField.sendKeys(s);
		
	}
	
    @FindBy(xpath="//input[@id='nav-search-submit-button']")
    WebElement searchIcon;
    public void getSearchIcon() {	 	
    	searchIcon.click();
    	
    }
    @FindBy(xpath="//span[contains(text(),'qa testing)]")
    public WebElement SearchItemPage;
    public void getSearchItemPage() { 
    	SearchItemPage.getText();
    	
 

}
}
