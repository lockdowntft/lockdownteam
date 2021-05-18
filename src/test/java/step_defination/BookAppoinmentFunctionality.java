package step_defination;

import java.io.IOException;

import org.junit.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.BookAnAppoinment;
import pageFactory.HomePage;

public class BookAppoinmentFunctionality extends TestBase{
	
	HomePage hm;
	BookAnAppoinment BA;

	public BookAppoinmentFunctionality() throws IOException {
		super();
		hm = new HomePage();
		BA = new BookAnAppoinment();
	}
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
	    System.out.println(hm.HomePageTitel());
	}

	@When("User click to Book an Appointment link")
	public void user_click_to_book_an_appointment_link() {
	   BA.clickBookanAppointmentlink();
	}

	@Then("User will land to Book an Appointment page")
	public void user_will_land_to_book_an_appointment_page() {
		 Assert.assertEquals(BA.TextBookAnAppoinment(), "Book an Appointment");
	}

	@When("User will find empty box to put information")
	public void user_will_find_empty_box_to_put_information() {
		Assert.assertEquals(BA.TextBookAnAppoinment(), "Book an Appointment");
	}

	@When("User can put name on Your Nmae box")
	public void user_can_put_name_on_your_nmae_box() {
	    BA.typeName();
	}

	@When("User Can put phone number on Phone Number box")
	public void user_can_put_phone_number_on_phone_number_box() {
	    BA.TypePhoneNumber();
	}

	@When("User can put email on Email box")
	public void user_can_put_email_on_email_bpx() {
	   BA.TypeEmail();
	}

	@When("User can put appoinment subject on Appoinment subject box")
	public void user_can_put_appoinment_subject_on_appoinment_subject_box() {
	   BA.TypeAppoinmentSubject();
	}

	@When("User can select the date, want appoinment")
	public void user_can_select_the_date_want_appoinment() {
	    BA.TypeAppoinmentDate();
	}

	@When("User can Write a massage on massage box")
	public void user_can_write_a_massage_on_massage_box() {
	    BA.TypeMassageBox();
	}

	@When("User can click to send masage")
	public void user_can_click_to_send_masage() {
	   BA.ClickSentMassagelink();
	}

	@Then("User will see massage has been sent")
	public void user_will_see_massage_has_been_sent() {
	   Assert.assertEquals(BA.getsentMassage(), "Thank you for your message. It has been sent.");
	}
}
