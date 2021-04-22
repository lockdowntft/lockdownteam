package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class Our_Innovative_Six_Step_Process extends TestBase{
	
	@FindBy(xpath="//h5[text()='Planning']")
	WebElement planningText;
	
	@FindBy(xpath="//div[contains(text(),'Custom one to one Career Counselling')]")
	WebElement PlanningDescription;
	
	@FindBy(xpath="//h5[text()='Enrolling']")
	WebElement EnrollingText;
	
	@FindBy(xpath="//div[contains(text(),'Live class lectures, in campus')]")
	WebElement EnrollingDescription;
	
	@FindBy(xpath="//h5[text()='Learning']")
	WebElement LearningText;
	
	@FindBy(xpath="//div[contains(text(),'Easy registration process')]")
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

	public Our_Innovative_Six_Step_Process() throws IOException {
		super();
		}
	
	public void getplanningText() {
		planningText.getText();
	}
		
		public void get_PlanningDescription_text() {
			PlanningDescription.getText();
		}
			
		public void getEnrollingText() {
			EnrollingText.getText();
		}
	public void GetEnrollingDescriptionText() {
		EnrollingDescription.getText();
	}
	public void getLearningText() {
		LearningText.getText();
	}
	
	public void GetLearningDescriptionText() {
		LearningDescription.getText();
	}
	
	public void getGainingText() {
		GainingText.getText();
	}
	
	public void GetGainingDescriptionText() {
		GainingDescription.getText();
	}
	
	public void getPerformingText() {
		PerformingText.getText();
	}
	
	public void GetPerformingDescriptionText() {
		PerformingDescription.getText();
	}
	
	public void getEarningText() {
		EarningText.getText();
	}
	
	public void GetEarningDescriptionText() {
		EarningDescription.getText();
	}

}
