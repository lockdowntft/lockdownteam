package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class OurInnovativeSixStep extends TestBase{
	@FindBy(xpath="//h2[text()='Our Innovative Six Step Process']")
	WebElement SixStep;
	
	@FindBy(xpath="//h5[text()='Planning']")
	WebElement planningText;
	
	@FindBy(xpath="//div[contains(text(),'Custom one to one Career Counselling')]")
	WebElement PlanningDescription;
	
	@FindBy(xpath="//h5[text()='Enrolling']")
	WebElement EnrollingText;
	
	@FindBy(xpath="//div[contains(text(),'Easy registration process through ')]")
	WebElement EnrollingDescription;
	
	@FindBy(xpath="//h5[text()='Learning']")
	WebElement LearningText;
	
	@FindBy(xpath="//div[contains(text(),'Live class lectures, in campus and online,')]")
	WebElement LearningDescription;
	
	@FindBy(xpath="//h5[text()='Gaining']")
	WebElement GainingText;
	
	@FindBy(xpath="//div[contains(text(),'Upon completion of the lectures')]")
	WebElement GainingDescription;
	
	@FindBy(xpath="//h5[text()='Performing']")
	WebElement PerformingText;
	
	@FindBy(xpath="//div[contains(text(),'Live Interview Preparation')]")
	WebElement PerformingDescription;
	
	@FindBy(xpath="//h5[text()='Earning']")
	WebElement EarningText;
	
	@FindBy(xpath="//div[contains(text(),'Upon completion of the lectures')]")
	WebElement EarningDescription;

	public OurInnovativeSixStep() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	public String GetTextSixStep() {
		return SixStep.getText();
	}
	
	public String getplanningText() {
		return planningText.getText();
	}
		
		public String get_PlanningDescription_text() {
			return PlanningDescription.getText();
		}
			
		public String getEnrollingText() {
			return EnrollingText.getText();
		}
	public String GetEnrollingDescriptionText() {
		return EnrollingDescription.getText();
	}
	public String getLearningText() {
		return LearningText.getText();
	}
	
	public String GetLearningDescriptionText() {
		return LearningDescription.getText();
	}
	
	public String getGainingText() {
		return GainingText.getText();
	}
	
	public String GetGainingDescriptionText() {
		return GainingDescription.getText();
	}
	
	public String getPerformingText() {
		return PerformingText.getText();
	}
	
	public String GetPerformingDescriptionText() {
		return PerformingDescription.getText();
	}
	
	public String getEarningText() {
		return EarningText.getText();
	}
	
	public String GetEarningDescriptionText() {
		return EarningDescription.getText();
	}

}
