package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class BookAnAppoinment extends TestBase{
	@FindBy(linkText="Book an Appointment")
	WebElement BookanAppointmentlink;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[1]/div[1]/span/input")
	WebElement Name;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[1]/div[2]/span/input")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[2]/div[1]/span/input")
	WebElement Email;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[2]/div[2]/div/span/input")
	WebElement AppoinmentSubject;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[3]/div[1]/span/input")
	WebElement AppoinmentDate;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[4]/div/span/textarea")
	WebElement MassageBox;
	
	@FindBy(xpath="//div[text()='Thank you for your message. It has been sent.']")
	WebElement sentMassage;
	
	@FindBy(xpath="//h2[contains(text(),'Book an Appointment')]")
	WebElement BookAnAppoinment;
	
	@FindBy(xpath="//*[@action='/#wpcf7-f3805-o1']/div[2]/div[5]/input")
	WebElement SentMassagelink;

	public BookAnAppoinment() throws IOException {
		PageFactory.initElements(driver,this);
			
	}
	
	
	public void clickBookanAppointmentlink() {
		BookanAppointmentlink.click();
	}
	public void typeName() {
		Name.sendKeys("Adom");
	}
	public void TypePhoneNumber() {
		PhoneNumber.sendKeys("2226759090");
	}
	public void TypeEmail() {
		Email.sendKeys(prop.getProperty("Email"));
	}
	
	public void TypeAppoinmentSubject() {
		AppoinmentSubject.sendKeys("Course information");
	}
	
	public void TypeAppoinmentDate() {
		AppoinmentDate.sendKeys("05/20/2021");
	}
	
	public void TypeMassageBox() {
		MassageBox.sendKeys("I like to get details information about QA course");
	}
	
	public void ClickSentMassagelink() {
		SentMassagelink.click();
	}

	public String getsentMassage() {
		return sentMassage.getText();
		
	}
	public String TextBookAnAppoinment() {
		return BookAnAppoinment.getText();
		
	}
}
