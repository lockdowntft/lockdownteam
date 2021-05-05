package step_defination;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory.HomePage;
import pageFactory.ServicesOnHomePage;

public class ServisesOnHomePageFunctionality extends TestBase {
	HomePage hm;
	ServicesOnHomePage soh;
	

	public ServisesOnHomePageFunctionality() throws IOException {
		super();
		hm=new HomePage();
		soh=new ServicesOnHomePage ();
		
	}
	@Given("User is in the Home page")
	public void user_is_in_the_home_page() {
	  System.out.println( hm.HomePageTitel());
	}

	@When("User get the IT Training headline")
	public void user_get_the_it_training_headline() {
	    Assert.assertEquals(soh.GetIT_Ttainingtext(), "IT Training");
	}

	@When("User find littel explanation about IT Training courses")
	public void user_find_littel_explanation_about_it_training_courses() {
	   Assert.assertEquals(soh.getTextLit_Disc_IT_Traing(), "We facilitate and deliver "
	   		+ "a range of instructor led IT training online & on campus");
	}

	

	@When("User click to the Learn More link")
	public void user_click_to_the_learn_more_link() {
	   soh.clickIT_Traininglink();
	}

	@Then("User will be IT Training courses page")
	public void user_will_be_it_training_courses_page() {
	   Assert.assertEquals(soh.HomePageTitel(), "TransfotechAcademy-IT Training");
	}

	@When("User get the Job Placement headline")
	public void user_get_the_job_placement_headline() {
	  System.out.println( soh.Get_Job_Placement_Text());
	}

	@When("User find littel explanation about Job Placement")
	public void user_find_littel_explanation_about_job_placement() {
	   Assert.assertEquals(soh.Lit_Disc_Job_Placement(), "We ensure job "
	   		+ "placement by creating professional resumes for students");
	}

	@Then("User will be Job Placement services page")
	public void user_will_be_job_placement_services_page() {
		Assert.assertEquals(soh.HomePageTitel(), "TransfotechAcademy-Job Placement");
	}

	@When("User get the IT Staffing headline")
	public void user_get_the_it_staffing_headline() {
	   System.out.println(soh.get_IT_Staffing_text());
	}

	@When("User find littel explanation about IT Staffing")
	public void user_find_littel_explanation_about_it_staffing() {
	   Assert.assertEquals(soh.Get_lit_Disc_IT_Staffing(), "We provide exceptional "
	   		+ "IT staffing services basing on your company’s unique hiring needs");
	}

	@Then("User will be IT Staffing services page")
	public void user_will_be_it_staffing_services_page() {
		Assert.assertEquals(soh.HomePageTitel(), "TransfotechAcademy-IT Staffing");
	}

	@When("User get the IT Consultancy headline")
	public void user_get_the_it_consultancy_headline() {
	   System.out.println(soh.GetText_IT_Consultancy());
	}

	@When("User find littel explanation about IT Consultancy services")
	public void user_find_littel_explanation_about_it_consultancy_services() {
	   Assert.assertEquals(soh.Lit_Disc_IT_Consultancy_text(), "We will guide and "
	   		+ "advise you on your critical technology decisions");
	}

	@Then("User will be IT Consultancy services page")
	public void user_will_be_it_consultancy_services_page() {
		Assert.assertEquals(soh.HomePageTitel(), "TransfotechAcademy-IT Consultancy");
	}

}
