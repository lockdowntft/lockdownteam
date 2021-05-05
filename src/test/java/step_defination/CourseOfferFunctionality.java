package step_defination;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory.CoursesOfferOnHomePage;
import pageFactory.HomePage;

public class CourseOfferFunctionality extends TestBase{
	CoursesOfferOnHomePage cof;
	HomePage hm;

	public CourseOfferFunctionality() throws IOException {
		super();
		 cof=new CoursesOfferOnHomePage();
	hm=new HomePage();
	}
	
	@Given("User is in the Home Page")
	public void user_is_in_the_home_page() {
	  System.out.println( hm.HomePageTitel());
	}

	@When("User click to Data Analytics link")
	public void user_click_to_data_analytics_link() {
	    cof.click_Data_Analytics_Visualization();
	}

	@Then("User should lands Data Analytics & Visualization page")
	public void user_should_lands_data_analytics_visualization_page() {
	   Assert.assertEquals(cof.get_DataAnalyticsVisualization_text(), "Data Analytics & Visualization");
	}

	@When("User click to Full Stack QA Engineering link")
	public void user_click_to_full_stack_qa_engineering_link() {
	   cof.click_Full_Stack_QA_Engineering();
	}

	@Then("User should lands Full Stack QA Engineering page")
	public void user_should_lands_full_stack_qa_engineering_page() {
	   Assert.assertEquals(cof.GetFullStackQAEngineeringText(),"Full Stack QA Engineering");
	}

	@When("User click to Business Analyst link")
	public void user_click_to_business_analyst_link() {
	   cof.Click_Business_Analyst_lin();
	}

	@Then("User should land Business Analyst page")
	public void user_should_land_business_analyst_page() {
	   Assert.assertEquals(cof.GetBusinessAnalystText(), "Business Analyst");
	}

	@When("User click to Cyber Security Professional link")
	public void user_click_to_cyber_security_professional_link() {
	    cof.Click_Cyber_Security_Professional_link();
	}

	@Then("User should lands Cyber Security Professional page")
	public void user_should_lands_cyber_security_professional_page() {
	   Assert.assertEquals(cof.GetCyberSecurityProfessionalText(), "Cyber Security Professional");
	}

	@When("User click to Explore all Courses link")
	public void user_click_to_explore_all_courses_link() {
	    cof.click_Explore_all_Courses();
	}

	@Then("User should land Explore all Courses page")
	public void user_should_land_explore_all_courses_page() {
	   Assert.assertEquals(cof.GetCoursesText(), "Courses");
	}

	@Given("User is in the Explore all Courses page")
	public void user_is_in_the_explore_all_courses_page() {
		
		 Assert.assertEquals(cof.GetCoursesText(), "Courses");
	}

	@When("User click to the Cloud Engineering Courses link")
	public void user_click_to_the_cloud_engineering_courses_link() {
	   cof.ClickCloudEngineeringLink();
	}

	@Then("Uaser should land Cloud Engineering Courses page")
	public void uaser_should_land_cloud_engineering_courses_page() {
	    Assert.assertEquals(cof.GetCloudEngineeringText(), "Cloud Engineering");
	}
	

	
}
