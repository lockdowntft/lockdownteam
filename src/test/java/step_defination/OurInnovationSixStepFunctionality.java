package step_defination;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory.HomePage;
import pageFactory.OurInnovativeSixStep;

public class OurInnovationSixStepFunctionality extends TestBase {
	HomePage hm;
	OurInnovativeSixStep ois;

	public OurInnovationSixStepFunctionality() throws IOException {
		super();
		hm=new HomePage();
		ois=new OurInnovativeSixStep();
	}
		@Given("User is in the homePage")
		public void user_is_in_the_home_page() {
			System.out.println(hm.HomePageTitel());
		   
		}

		@When("User get the text Our Innovative Six Step Process")
		public void user_get_the_text_our_innovative_six_step_process() {
			
		   System.out.println(ois.GetTextSixStep());
		   
		   Assert.assertEquals(ois.GetTextSixStep(), "Our Innovative Six Step Process");
		}

		@Then("user should get the first steps text")
		public void user_should_get_the_first_steps_text() {
			System.out.println(ois.getplanningText());
			
		   
		}

		@Then("User should get littel explanation about first step")
		public void user_should_get_littel_explanation_about_first_step() {
		   Assert.assertEquals(ois.get_PlanningDescription_text(), "Custom one to one"
		   		+ " Career Counselling and goal setting with a Career Advisor.");
		}

		@Then("user should get the second steps text")
		public void user_should_get_the_second_steps_text() {
		   System.out.println(ois.getEnrollingText());
		}

		@Then("User should get littel explanation about second step")
		public void user_should_get_littel_explanation_about_second_step() {
		   Assert.assertEquals(ois.GetEnrollingDescriptionText(), "Easy registration process "
		   		+ "through our online portal.");
		}

		@Then("user should get the thired steps text")
		public void user_should_get_the_thired_steps_text() {
		   System.out.println(ois.getLearningText());
		}

		@Then("User should get littel explanation about thired step")
		public void user_should_get_littel_explanation_about_thired_step() {
		  Assert.assertEquals(ois.GetLearningDescriptionText(), "Live class lectures,"
		  		+ " in campus and online, labs, assignments, LMS, Class Recordings.");
		}

		@Then("user should get the fourth steps text")
		public void user_should_get_the_fourth_steps_text() {
		    System.out.println(ois.getGainingText());
		}

		@Then("User should get littel explanation about fourth step")
		public void user_should_get_littel_explanation_about_fourth_step() {
		   Assert.assertEquals(ois.GetGainingDescriptionText(), "Upon completion of "
		   		+ "the lectures, 2 weeks real project internship.");
		}

		@Then("user should get the fifth steps text")
		public void user_should_get_the_fifth_steps_text() {
		   System.out.println(ois.getPerformingText());
		}

		@Then("User should get littel explanation about fifth step")
		public void user_should_get_littel_explanation_about_fifth_step() {
		   Assert.assertEquals(ois.GetPerformingDescriptionText(), "Live Interview "
		   		+ "Preparation, Mock Interviews");
		}

		@Then("user should get the sixth steps text")
		public void user_should_get_the_sixth_steps_text() {
		   System.out.println(ois.getEarningText());
		}

		@Then("User should get littel explanation about sixth step")
		public void user_should_get_littel_explanation_about_sixth_step() {
		   Assert.assertEquals(ois.GetEarningDescriptionText(), "Upon completion "
		   		+ "of the lectures, 2 weeks real project internship.");
		}

	}


