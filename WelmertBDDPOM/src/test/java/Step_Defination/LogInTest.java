package Step_Defination;

import java.io.IOException;


import org.testng.Assert;

import Base.TestBase;
import PageFactory.HomePageLink;
import PageFactory.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInTest extends TestBase{
	HomePageLink hp;
	LogInPage Log;
	public LogInTest() throws IOException {
		super();
		hp=new HomePageLink();
		Log=new LogInPage();
	}

	@Given("User Shuild be in the Home Page")
	public void user_Should_be_in_the_home_page() {
	    System.out.println(hp.HomePageTitel());
	}

	@When("User able to click to the Account link")
	public void userable_to_click_to_the_account_link() {
	   hp.Accountclick();
	}

	@When("User click to the signin link")
	public void user_click_to_the_signin_link() {
	    hp.SignInClick();
	}

	@Then("User will be in the signin page")
	public void user_will_be_in_the_signin_page() {
	   System.out.println(hp.SignInPageTitel());
	   
	   Assert.assertEquals(hp.SignInPageTitel(), "Login");
	   hp.BacktoHomePage();
	}
	
	@When ("User put Valied Email and Password")
	public void User_put_Valied_Email_and_Password() {
		Log.TypeEmail("ValiedEmail");
		Log.Typepassword("valiedPassword");
	}
    @And ("User click to the SignIn button")
    public void User_click_to_the_SignIn_button() {
    	Log.clickSignInButton();
    }
    @Then ("User should SuccessFully log in to the account")
    public void User_should_SuccessFully_log_in_to_the_account() {
    	System.out.println(Log.GetSignInPAgeTitel());
    	Assert.assertEquals(Log.GetSignInPAgeTitel(), "Walmart.com |Save Money. Live Better.");
    }
    @When ("User put invalied Email and Password")
    public void User_put_invalied_Email_and_Password() {
    	Log.TypeEmail("InvaliedEmail");
    	Log.Typepassword("InvaliedPassword");
    }
    @Then ("User should not SuccessFully log in to the account")
    public void User_should_not__log_in_to_the_account() {
    	Assert.assertEquals(Log.GetLogInFailPageTitel(),
   "Your password and email do not match. Please try again or");
    }
}
