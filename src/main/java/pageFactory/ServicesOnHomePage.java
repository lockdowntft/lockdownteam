package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
		super();
		
	}
	
	public void clickIT_Traininglink() {
		IT_Traininglink.click();
	}
	public void GetIT_Ttainingtext() {
		ITTrainingText.getText();
	}
	public void getTextLit_Disc_IT_Traing() {
		Lit_Disc_IT_Traing.getText();
	}
	public void Get_Job_Placement_Text() {
		JobPlacement_text.getText();
	}
	public void Lit_Disc_Job_Placement() {
		lit_Disc_Job_Placement.getText();
	}
	
	public void Click_Job_Placementlink() {
		Job_Placementlink.click();
	}
	
	public void get_IT_Staffing_text () {
		IT_Staffing_text.getText();
	}
	public void Get_lit_Disc_IT_Staffing() {
		lit_Disc_IT_Staffing.getText();
	}
	public void ClickIT_Staffinglink() {
		IT_Staffinglink.click();
	}
	
	public void GetText_IT_Consultancy() {
		GetText_IT_Consultancy.getText();
	}
	
	public void Lit_Disc_IT_Consultancy_text() {
		Lit_Disc_IT_Consultancy_text.getText();
	}


}
