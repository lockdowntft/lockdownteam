package Step_Defination;

import java.io.IOException;

import org.testng.Assert;

import Base.TestBase;
import PageFactory.BuyProduct;
import PageFactory.HomePageLink;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductFunctionalTest extends TestBase {
	public static HomePageLink Hp;
	public static BuyProduct Bp;

	public BuyProductFunctionalTest() throws IOException {
		super();
		Hp=new HomePageLink();
		Bp= new BuyProduct();
	}

	@Given("User should be in the Amazon Homepage")
	public void user_should_be_in_the_amazon_homepage() {
	   Hp.HomepageTitel();
	}

	@When("User search desire product")
	public void user_search_desire_product() {
	  Hp.TypedProduct();
	}

	@Then("User will see their desier product")
	public void user_will_see_their_desier_product() {
	   Hp.FindDesireProductPageTitel();
	   Assert.assertEquals(Hp.FindDesireProductPageTitel(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	   Hp.BackHOmePage();
	}

	@When("User click to the diser product.")
	public void user_click_to_the_diser_product() {
		Bp.ClickDiserProduct();
	   
	}

	@Then("User will see phone color option")
	public void user_will_see_phone_color_option() {
		Assert.assertEquals(Bp.GetColorText(), "Color");
	}

	@Then("User will see Memory Size optin")
	public void user_will_see_memory_size_optin() {
	   Assert.assertEquals(Bp.GetSizeText(), "Size");
	}

	@Then("User will see initial cost and monthly cost")
	public void user_will_see_initial_cost_and_monthly_cost() {
	   Assert.assertEquals(Bp.GetInitialCostText(), "Initial");
	   Assert.assertEquals(Bp.GetMonthlyCostText(), "MonthlyCost");
	}

	@When("user pic the color memory size and cost")
	public void user_pic_the_color_memory_size_and_cost() {
	   Bp.ClickRedColor();
	   Bp.ClickMemorySize();
	}

	@When("User click to buy now button")
	public void user_click_to_buy_now_button() {
	    Bp.ClickAddCart();
	}

	@Then("User will see buying methode")
	public void user_will_see_buying_methode() {
	   Assert.assertEquals(Bp.getPaymentMethodText(), "Select a payment method");
	}

	@When("User click Add Personal Checking Accounts")
	public void user_click_add_personal_checking_accounts() {
	   Bp.ClickCheckingAccount();
	}

	@Then("user will see Name on Account box and Bank Routing Number box")
	public void user_will_see_name_on_account_box_and_bank_routing_number_box() {
	   
	}

	@Then("User will see Id number box  and select state box")
	public void user_will_see_id_number_box_and_select_state_box() {
	   
	}

	@When("User click add this Checking Accounts")
	public void user_click_add_this_checking_accounts() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will see continue button of review order before it is final")
	public void user_will_see_continue_button_of_review_order_before_it_is_final() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click to the continue button")
	public void user_click_to_the_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User will see a buying confurmation number")
	public void user_will_see_a_buying_confurmation_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
