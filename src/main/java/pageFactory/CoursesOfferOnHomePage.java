package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CoursesOfferOnHomePage extends TestBase {
	
	
	@FindBy(linkText="Data Analytics & Visualization")
	WebElement Data_Analytics;
	
	
	@FindBy(xpath="//h1[text()=' Data Analytics & Visualization']")
	WebElement  DataAnalyticsVisualization_text;
	
	@FindBy(linkText="Full Stack QA Engineering")
	WebElement Full_Stack_QA_Engineering;
	
	@FindBy(xpath="//h1[text()=' Full Stack QA Engineering']")
	WebElement  FullStackQAEngineeringText;
	
	@FindBy(linkText="Business Analyst")
	WebElement Business_Analyst_link;
	
	@FindBy(xpath="//h1[text()=' Business Analyst']")
	WebElement BusinessAnalystText;
	
	@FindBy(linkText="Cyber Security Professional")
	WebElement Cyber_Security_Professional_link;
	
	@FindBy(xpath="//h1[text()=' Cyber Security Professional']")
	WebElement CyberSecurityProfessionalText;
	
	@FindBy(xpath="//u[text()='Explore all Courses']")
	WebElement Explore_all_Courses;
	
	@FindBy(xpath="//h1[text()=' Courses']")
	WebElement CoursesText;
	
	@FindBy(linkText="Cloud Engineering")
	WebElement CloudEngineeringLink;
	
	@FindBy(xpath="//h1[text()=' Cloud Engineering']")
	WebElement CloudEngineeringText;

	public CoursesOfferOnHomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void click_Data_Analytics_Visualization() {
		Data_Analytics.click();
	}
	public String get_DataAnalyticsVisualization_text() {
		return DataAnalyticsVisualization_text.getText();
	}
	public void click_Full_Stack_QA_Engineering() {
		Full_Stack_QA_Engineering.click();
	}
	public String GetFullStackQAEngineeringText() {
		return FullStackQAEngineeringText.getText();
		}
	public void Click_Business_Analyst_lin() {
		Business_Analyst_link.click();
	}
	
	public String GetBusinessAnalystText() {
		return BusinessAnalystText.getText();
		
	}
	public void Click_Cyber_Security_Professional_link() {
		Cyber_Security_Professional_link.click();
	}
	
	public String GetCyberSecurityProfessionalText() {
		return CyberSecurityProfessionalText.getText();
		
	}
	public void click_Explore_all_Courses() {
		Explore_all_Courses.click();
	}
	
	public String GetCoursesText() {
		return CoursesText.getText();
		
	}
	public void ClickCloudEngineeringLink() {
		CloudEngineeringLink.click();
	}
	public String GetCloudEngineeringText() {
		return CloudEngineeringText.getText();
		
	}

}
