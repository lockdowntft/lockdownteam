package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePageLink extends TestBase{

	public HomePageLink() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"hf-account-flyout\"]/span/span/span[2]")
	WebElement AccountLink;
	
	@FindBy(xpath="//div[text()='Sign In']")
	WebElement SignINLink;
	
	@FindBy(linkText="Pickup & delivery")
	WebElement PicupDeliveryLink;
	
	@FindBy(xpath="//*[@id=\"header-Header-sparkButton\"]/span/img")
	WebElement MenuBarLink;

	@FindBy(id="global-search-input")
	WebElement SearchBox;
	
	@FindBy(xpath="//*[@id=\"global-search-submit\"]/span/img")
	WebElement SearchButton;
	
	@FindBy(xpath="//span[text()='My Items']")
	WebElement MyIteamLink;
	
	@FindBy(xpath="//*[@id=\"hf-cart\"]/span/span")
	WebElement CartLink;
	
	@FindBy(xpath="//span[text()='iPhone 12 Pro Max (AT&T & Verizon)']")
	WebElement DesplayProduct;
	
	public void Accountclick() {
		AccountLink.click();
	}
	public void SignInClick() {
		SignINLink.click();
	}
	
	public void BacktoHomePage() {
		driver.navigate().back();
	}
	public void PicupDeliveryLinkclick() {
		PicupDeliveryLink.click();
	}
	public void MenuBarClick() {
		MenuBarLink.click();
	}
	public void TypeProduct() {
		SearchBox.sendKeys("iphone 12 pro max");
	}
	public void clickSearchButton() {
		SearchButton.click();
	}
	public void ClikMyIteamLink() {
		MyIteamLink.click();
	}
	public void clickCartLInk() {
		CartLink.click();
	}
	public void getProducttext() {
		DesplayProduct.getText().trim();
	}
	public String HomePageTitel() {
		return driver.getTitle();
		}
	public String SignInPageTitel() {
		return driver.getTitle();
		}
	public String PickupPageTitel() {
		return driver.getTitle();
		}
	public String MenubarPageTitel() {
		return driver.getTitle();
		}
	public String DesierProdectPageTitel() {
		return driver.getTitle();
		}
	public String MyItemPageTitel() {
		return driver.getTitle();
		}
	public String CartPageTitel() {
		return driver.getTitle();
		}
}
