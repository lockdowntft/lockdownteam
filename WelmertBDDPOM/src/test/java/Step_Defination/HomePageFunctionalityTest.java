package Step_Defination;

import java.io.IOException;

import org.testng.Assert;

import Base.TestBase;
import PageFactory.HomePageLink;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageFunctionalityTest extends TestBase {
     HomePageLink hp;
	public HomePageFunctionalityTest() throws IOException {
		super();
		hp=new HomePageLink();
		
	}
	
	
	
	
	@Given("User is in the Home Page")
	public void user_is_in_the_home_page() {
	    System.out.println(hp.HomePageTitel());
	}

	@When("User click to the Account link")
	public void user_click_to_the_account_link() {
	   hp.Accountclick();
	}

	@When("User should click to the signin link")
	public void user_should_click_to_the_signin_link() {
	    hp.SignInClick();
	}

	@Then("User should be in the signin page")
	public void user_should_be_in_the_signin_page() {
	   System.out.println(hp.SignInPageTitel());
	   
	   Assert.assertEquals(hp.SignInPageTitel(), "Login");
	   hp.BacktoHomePage();
	}

	@When("User click to the Pickup & delivery link")
	public void user_click_to_the_pickup_delivery_link() {
	   hp.PicupDeliveryLinkclick();
	}

	@Then("User will be in the Pickup & delivery page")
	public void user_will_be_in_the_pickup_delivery_page() {
	    System.out.println(hp.PickupPageTitel());
	    Assert.assertEquals(hp.PickupPageTitel(), "Walmart Grocery");
	    hp.BacktoHomePage();
	}

	@When("User click to the menu bar link")
	public void user_click_to_the_menu_bar_link() {
	   hp.MenuBarClick();
	}

	@Then("User should be in the menu bar page")
	public void user_should_be_in_the_menu_bar_page() {
	   System.out.println(hp.MenubarPageTitel());
	   Assert.assertEquals(hp.MenubarPageTitel(), "Walmart.com | Save Money. Live Better.");
	   hp.BacktoHomePage();
	}

	@When("User search product on the search box")
	public void user_search_product_on_the_search_box() {
	   hp.TypeProduct();
	}

	@When("User User click to submeet button to find product")
	public void user_user_click_to_submeet_button_to_find_product() {
	   hp.clickSearchButton();
	}

	@Then("User should see the desier product")
	public void user_should_see_the_desier_product() {
	    System.out.println(hp.DesierProdectPageTitel());
Assert.assertEquals(hp.DesierProdectPageTitel(), "");
	    hp.BacktoHomePage();
	}

	@When("User click to hte My Items link")
	public void user_click_to_hte_my_items_link() {
	   hp.ClikMyIteamLink();
	}

	@Then("User will be in the My Items page")
	public void user_will_be_in_the_my_items_page() {
	    System.out.println(hp.MyItemPageTitel());
	    Assert.assertEquals(hp.MyItemPageTitel(), "Easy Reorder - Walmart.com");    
	    hp.BacktoHomePage();
	}

	@When("User click to the cart link")
	public void user_click_to_the_cart_link() {
	    hp.clickCartLInk();
	}

	@Then("User should be in the cart page")
	public void user_should_be_in_the_cart_page() {
	  System.out.println(hp.CartPageTitel());
	  Assert.assertEquals(hp.CartPageTitel(), "https://WWW.Walmart.com/cart");
	}
	
	

}
