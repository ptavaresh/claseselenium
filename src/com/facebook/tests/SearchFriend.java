package com.facebook.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.facebook.pages.LoginPage;
import com.facebook.pages.ResultPage;
import com.facebook.pages.SearchBarPage;

public class SearchFriend {
	SearchBarPage sbp;
	ResultPage rp;
	LoginPage loginPage;
	String user = "clase.selenium@gmail.com";
	String pass = "test@1234";
	String nombre;
	public WebDriver driver;
	public WebDriverWait explicitWait;

@Before
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
	explicitWait = new WebDriverWait(driver, 10);
	driver.navigate().to("http://www.facebook.com");
	loginPage = new LoginPage(driver);

}
@Test
//1.-Loggin en facebook - LogginPage /UserBox, PassBox, FacebookLogo, SubmitButton
//2.-Busca persona - SearchBarPage /SearchBox, FacebookLeftLogo, SearchButton, ProfileLink
//3.-Verifica el resultado de la busqueda - ResultPage /PeopleSection, ProfilesLink
//4.-Click en agregar amigos - ResultPage - ResultPage /PeopleSection, ProfilesLink, AddButton
//5.-Verificar que la solicitud fue enviada - ResultPage /PeopleSection, ProfilesLink, SentRequestButton
	public void testFriendSearch(){
		sbp = loginPage.loginToFacebook(user, pass);
		rp = sbp.searchFriend(nombre);
		rp.verifySearchResult(nombre);
		rp.clickAddFriends(nombre);	
		rp.verifySentRequest(nombre);
	
	
}
	
	public SearchFriend() {

	}

}
