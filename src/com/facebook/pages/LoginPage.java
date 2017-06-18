package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.util.Locators;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		// TODO Auto-generated constructor stub
	}
//LogginPage /UserBox, PassBox, FacebookLogo, SubmitButton
	private WebDriver driver;
	
	@FindBy(how = How.ID, using = "email")
	WebElement userBox;
	@FindBy(how = How.ID, using = "pass")
	WebElement passBox;
	@FindBy(how = How.XPATH, using = "//a[@title='Ir a la página de inicio de Facebook']")
	WebElement facebookLogo;
	@FindBy(how = How.ID, using = "loginbutton")
	WebElement submitButton;
	
	public SearchBarPage loginToFacebook(String user, String pass) {
		if (userBox.isDisplayed() &&
				passBox.isDisplayed() &&
				submitButton.isDisplayed() &&
				facebookLogo.isDisplayed()){
			System.out.println("Elementos login cargados");
		userBox.clear();
		userBox.sendKeys(user);
		passBox.clear();
		passBox.sendKeys(pass);
		submitButton.click();
		}
		else{
			System.out.println("No se cargaron los elementos.");
			System.exit(-1);
		}
		return new SearchBarPage(driver);
	}

}
