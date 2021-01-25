package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class addCustomerTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage =  PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserID("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignIn();
		
		DashBoardPage dashbaoBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		dashbaoBoardPage.validateDashboardHeader();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.clickOnCustomerField();
		addCustomerPage.clickAddCustomerField();
		addCustomerPage.insertUserName("Shamim R");
		addCustomerPage.insertCompanyName("Techfios");
		addCustomerPage.insertEmailAddress("abc@tf.com");
		addCustomerPage.insertPhoneNumber("123456");
		addCustomerPage.insertStreetAddress("East Belt Line road");
		addCustomerPage.insertCity("Carrollton");
		addCustomerPage.insertState("TX");
		addCustomerPage.insertZip("75006");
		
		addCustomerPage.selectGroupName("AUG 2020");
		
		addCustomerPage.clickToSave();
		
		BrowserFactory.tearDown();

		
	}

}
