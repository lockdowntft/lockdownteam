package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogInPage extends TestBase {

	public LogInPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement ValiedEmail;
	
	@FindBy(id="password")
	WebElement ValiedPassword;
	
	@FindBy(xpath="//*[@id=\"sign-in-form\"]/button[1]")
	WebElement SignInButton;
	
	@FindBy(xpath="//div[text()='Your password and email do not match. Please try again or ']")
	WebElement ErrorMassage;
	
	public void TypeEmail(String UserEmail) {
		ValiedEmail.sendKeys(Pro.getProperty(UserEmail));
	}
	public void Typepassword(String UserPassword) {
		ValiedPassword.sendKeys(Pro.getProperty(UserPassword));
	}
	public void clickSignInButton() {
		SignInButton.click();
	}
	
	public void GetErrorMassage() {
		ErrorMassage.getText().trim();
	}
	public String GetSignInPAgeTitel() {
		return driver.getTitle();
		
	}
	public String GetLogInFailPageTitel() {
		return driver.getTitle();
		
	}
	
	
}
