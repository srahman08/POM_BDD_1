package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;

	public void LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']") WebElement SIGNIN_FIELD;

	public void enterUserID(String userID) {
		USERNAME_FIELD.sendKeys(userID);
	}
	public void enterPassword(String password){
		PASSWORD_FIELD.sendKeys(password);
	}
	public void clickSignIn() {
		SIGNIN_FIELD.click();
	}
	
	/*
	 * public void logIn(String userID, String password ) {
	 * USERNAME_FIELD.sendKeys(); PASSWORD_FIELD.sendKeys(); SIGNIN_FIELD.click(); }
	 */
	
}



