package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactUs extends TestBase{
	
	Actions action=new Actions(driver);
	
	@FindBy(linkText="Contact Us")
	WebElement ContectUsLink;
	
	@FindBy(linkText="Career")
	WebElement careerlink;
	
	@FindBy(xpath="//p[contains(text(),'Transfotech Academy is looking for an individual')]")
	WebElement careerpageText;
	
	@FindBy(xpath="//span[text()='No jobs currently listed']")
	WebElement joblist;

	public ContactUs() throws IOException {
		PageFactory.initElements(driver,this);
		
	}

	public void clickContectUsLink() {
		
		action.moveToElement(ContectUsLink).build().perform();
	}
	
	public void clickcareerlink() {
		action.moveToElement(careerlink).click().build().perform();
	}
	public String getcareerlinkText() {
		return careerlink.getText();
		
	}
	public String GetcareerpageText() {
		return careerpageText.getText();
		
	}
	
	public String Getjoblist() {
		return joblist.getText();
		
	}
	
}
