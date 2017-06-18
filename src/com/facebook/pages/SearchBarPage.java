package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage {

	public SearchBarPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	}
//SearchBarPage /SearchBox, FacebookLeftLogo, SearchButton, ProfileLink
	private WebDriver driver;
	
	WebElement searchBox;
	WebElement facebookLeftLogo;
	WebElement searchButton;
	WebElement profileLink;
	
	public ResultPage searchFriend(String nombre) {
		return new ResultPage(driver);
		
	}

}
