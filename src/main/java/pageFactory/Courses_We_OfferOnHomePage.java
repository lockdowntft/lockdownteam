package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class Courses_We_OfferOnHomePage extends TestBase {
	
	
	@FindBy(linkText="Data Analytics & Visualization")
	WebElement Data_Analytics;
	
	@FindBy(xpath="//h1[text()=' Data Analytics & Visualization']")
	WebElement  DataAnalyticsVisualization_text;
	
	@FindBy(linkText="Full Stack QA Engineering")
	WebElement Full_Stack_QA_Engineering;
	
	@FindBy(linkText="Business Analyst")
	WebElement Business_Analyst_link;
	
	@FindBy(linkText="Cyber Security Professional")
	WebElement Cyber_Security_Professional_link;
	
	@FindBy(xpath="//u[text()='Explore all Courses']")
	WebElement Explore_all_Courses;

	public Courses_We_OfferOnHomePage() throws IOException {
		super();
		
	}
	
	public void click_Data_Analytics_Visualization() {
		Data_Analytics.click();
	}
	public void get_DataAnalyticsVisualization_text() {
		Data_Analytics.getText();
	}
	public void click_Full_Stack_QA_Engineering() {
		Full_Stack_QA_Engineering.click();
	}
	public void Click_Business_Analyst_lin() {
		Business_Analyst_link.click();
	}
	public void Click_Cyber_Security_Professional_link() {
		Cyber_Security_Professional_link.click();
	}
	public void click_Explore_all_Courses() {
		Explore_all_Courses.click();
	}

}
