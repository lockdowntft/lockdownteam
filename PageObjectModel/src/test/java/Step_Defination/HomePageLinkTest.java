package Step_Defination;

import java.io.IOException;

import org.junit.Assert;

import Base.TestBase;
import PageFactory.HomePageLink;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageLinkTest extends TestBase{
	public static HomePageLink Hp;
	
	public HomePageLinkTest() throws IOException {
		super();
		 Hp=new HomePageLink();
	}

	@Given("User is in the Amazon Homepage")
	public void user_is_in_the_amazon_homepage() {
	    Hp.HomepageTitel();
	}

	@When("User click to Account Link")
	public void user_click_to_account_link() {
	   Hp.Accountclick();
	}

	@Then("User will be in the Login page")
	public void user_will_be_in_the_login_page() {
	   Hp.SignPageTitel();
	   Assert.assertEquals(Hp.SignPageTitel(), "");
	   Hp.BackHOmePage();
	}

	@When("User click to the All menu link")
	public void user_click_to_the_all_menu_link() {
	   Hp.AllMenuClick();
	}

	@Then("User should see All the menu")
	public void user_should_see_all_the_menu() {
	   Hp.AllMenuPAgeTitle();
	   Assert.assertEquals(Hp.AllMenuPAgeTitle(), "");
	   Hp.BackHOmePage();
	}


	@When("User able to search desire product")
	public void user_able_to_search_desire_product() {
	    Hp.TypedProduct();
	}

	@Then("User should see their desier product")
	public void user_should_see_their_desier_product() {
	   Hp.FindDesireProductPageTitel();
	   Assert.assertEquals(Hp.FindDesireProductPageTitel(), "");
	}

	@When("USer click to the ruturn link")
	public void u_ser_click_to_the_ruturn_link() {
	   Hp.ClickReturn();
	}

	@Then("User should be in the return page")
	public void user_should_be_in_the_return_page() {
	  Hp.ReturnPageTitel();
	  Assert.assertEquals(Hp.ReturnPageTitel(), "");
	}

	@When("User click to curt link")
	public void user_click_to_curt_link() {
	   Hp.ClickCurt();
	   
	}

	@Then("User should be curt page")
	public void user_should_be_curt_page() {
	   Hp.CurtPageTitel();
	   Assert.assertEquals(Hp.CurtPageTitel(), "");
	}
}
