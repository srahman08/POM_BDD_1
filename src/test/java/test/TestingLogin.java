package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class TestingLogin {
	WebDriver driver;
	
	@Test
	public void testingUserLogin() {
		
		 driver = BrowserFactory.init();
				 
		LoginPage loginPage =  PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserID("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignIn();
		
		DashBoardPage dashbaoBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashbaoBoardPage.validateDashboardHeader();
		//BrowserFactory.tearDown();
		
	}
	

}
