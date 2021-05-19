package step_defination;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageFactory.ContactUs;

public class ContectUsFunctionality extends TestBase{
	ContactUs CU;

	public ContectUsFunctionality() throws IOException {
		super();
		CU= new ContactUs();
		
	}
	@When("User keep the karsor on contectUs link")
	public void user_keep_the_karsor_on_contect_us_link() {
		CU.clickContectUsLink();
	}

	@Then("User will see carrer link")
	public void user_will_see_carrer_link() {
	   Assert.assertEquals(CU.getcareerlinkText(), "Career");
	}

	@When("User click to carrer link")
	public void user_click_to_carrer_link() {
	    CU.clickcareerlink();
	}

	@When("User will land to carrer page")
	public void user_will_land_to_carrer_page() {
	   Assert.assertEquals(CU.GetcareerpageText(), "Transfotech Academy is looking for an individual to join "
	   		+ "our team. Our ideal candidate is self-driven, motivated, and trustworthy. Apply using the apply button.");
	}

	@When("User will find the list of jobs")
	public void user_will_find_the_list_of_jobs() {
	   Assert.assertEquals(CU.Getjoblist(), "No jobs currently listed");
	}

}
