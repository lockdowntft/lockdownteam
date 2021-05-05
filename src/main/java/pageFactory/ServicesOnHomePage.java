package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ServicesOnHomePage extends TestBase {
	
	
	@FindBy(linkText="Learn More")
	WebElement IT_Traininglink;
	
	@FindBy(xpath="//h2[text()='IT Training']")
	WebElement ITTrainingText;
	
	@FindBy(xpath="//p[contains(text(),'We facilitate and deliver')]")
	WebElement Lit_Disc_IT_Traing;
	
	@FindBy(xpath="//h2[text()='Job Placement']")
	WebElement JobPlacement_text;
	
	@FindBy(xpath="//span[contains(text(),'We ensure job placement')]")
	WebElement lit_Disc_Job_Placement;
	
	@FindBy(linkText="Learn More ")
	WebElement Job_Placementlink;
	
	@FindBy(xpath="//h2[text()='IT Staffing']")
	WebElement IT_Staffing_text;
	
	@FindBy(xpath="//p[contains(text(),'We provide exceptional')]")
	WebElement lit_Disc_IT_Staffing;
	
	@FindBy(linkText="Learn More ")
	WebElement IT_Staffinglink;
	
	@FindBy(xpath="//h2[text()='IT Consultancy']")
	WebElement GetText_IT_Consultancy;
	
	@FindBy(xpath="//p[contains(text(),'We will guide')]")
	WebElement Lit_Disc_IT_Consultancy_text;
	
	@FindBy(linkText="Learn More ")
	WebElement IT_consultancyLink;

	public ServicesOnHomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickIT_Traininglink() {
		IT_Traininglink.click();
	}
	public String GetIT_Ttainingtext() {
		return ITTrainingText.getText();
	}
	public String getTextLit_Disc_IT_Traing() {
		return Lit_Disc_IT_Traing.getText();
	}
	public String Get_Job_Placement_Text() {
		return JobPlacement_text.getText();
	}
	public String Lit_Disc_Job_Placement() {
		return lit_Disc_Job_Placement.getText();
	}
	
	public void Click_Job_Placementlink() {
		Job_Placementlink.click();
	}
	
	public String get_IT_Staffing_text () {
		return IT_Staffing_text.getText();
	}
	public String Get_lit_Disc_IT_Staffing() {
		return lit_Disc_IT_Staffing.getText();
	}
	public void ClickIT_Staffinglink() {
		IT_Staffinglink.click();
	}
	
	public String GetText_IT_Consultancy() {
		return GetText_IT_Consultancy.getText();
	}
	
	public String Lit_Disc_IT_Consultancy_text() {
		return Lit_Disc_IT_Consultancy_text.getText();
	}
	
	public void clickIT_consultancyLink() {
		IT_consultancyLink.click();
	}

   public String HomePageTitel() {
	return driver.getTitle();
	
}
}
