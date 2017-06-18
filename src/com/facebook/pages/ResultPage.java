package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	}
//ResultPage /PeopleSection, ProfilesLink, SentRequestButton
	private WebDriver driver;
	
	WebElement peopleSection;
	WebElement profilesLink;
	WebElement sentRequestButton;
	WebElement addButton;
	
	public void verifySearchResult(String nombre) {
		// TODO Auto-generated method stub
		
	}

	public void clickAddFriends(String nombre) {
		// TODO Auto-generated method stub
		
	}

	public void verifySentRequest(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
