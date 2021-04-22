package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class Our_Upcoming_Events extends TestBase{
	
	@FindBy(linkText="Cyber Security And Web App Seminar in 2020")
	WebElement Cyber_SecurityEvent_Link;
	
	@FindBy(linkText="View Details")
	WebElement ViewDetailsLInk;
	
	@FindBy(xpath="//u[text()='View more Events']")
	WebElement ViewMoreEventsLink;

	public Our_Upcoming_Events() throws IOException {
		super();
		
	}
	
	public void clickCyber_SecurityEvent_Link() {
		Cyber_SecurityEvent_Link.click();
	}
	
	public void ClickViewDetailsLInk() {
		ViewDetailsLInk.click();
	}
	
	public void clickViewMoreEventsLink() {
		ViewMoreEventsLink.click();
	}
}
