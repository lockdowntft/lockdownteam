package pageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomepageSlide extends TestBase {

	public HomepageSlide() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id='rev_slider_9_1']/rs-arrow[2]")
	WebElement Boxin1stSlide;

	@FindBy(xpath="//*[@id='rev_slider_9_1']/rs-arrow[1]")
	WebElement Arrowin1stslide;
	
	
}
