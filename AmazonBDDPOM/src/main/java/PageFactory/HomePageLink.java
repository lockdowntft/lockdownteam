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
	
@FindBy(id="nav-link-accountList-nav-line-1")
WebElement AccountLink;

@FindBy(linkText="All")
WebElement AllMenue;

@FindBy(id="twotabsearchtextbox")
WebElement SearchBox;

@FindBy()
WebElement WriteOnSerchBox;
@FindBy(linkText="Returns & Orders")
WebElement Return;

@FindBy(id="nav-cart-count")
WebElement Curt;


public String HomepageTitel() {
	return driver.getTitle();	
}

public void Accountclick() {
	AccountLink.click();
}
	public String SignPageTitel() {
		return driver.getTitle();
		
	}
	public void AllMenuClick() {
		AllMenue.click();
	}
	public String AllMenuPAgeTitle() {
		return driver.getTitle();
		}
	public void TypedProduct() {
		SearchBox.sendKeys("phone 12 pro max");
	}
	public String FindDesireProductPageTitel() {
		return driver.getTitle();
		
	}
	public void ClickReturn() {
		Return.click();
	}
	public String ReturnPageTitel() {
		return driver.getTitle();
		
	}
	public void ClickCurt() {
		
	}
	public String CurtPageTitel() {
		return driver.getTitle();
		
	}
	public void BackHOmePage() {
		 driver.navigate().back();
		
	}
}
