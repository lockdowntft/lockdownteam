package PageFactory;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.TestBase;

public class BuyProduct extends TestBase{

	public BuyProduct() throws IOException {
		super();
		
	}
 @FindBy(linkText ="Apple iPhone 11 (64GB, Yellow) [Locked] + Carrier Subscription")
 WebElement DiserProduct;
 
 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[3]/div[2]/div[12]/div/div[2]/div/span[1]")
 WebElement color;
 
 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[3]/div[2]/div[12]/div/div[2]/div/span[1]")
 WebElement SizeText;
 
 @FindBy(xpath="//label[text()='Initial cost']")
 WebElement InitialCost;
 
 @FindBy(xpath="//label[text()='Monthly cost']")
 WebElement MonthlyCost;
 
 @FindBy(id="span[id='a-autoid-21-announce']")
 WebElement RedColor;
 
 @FindBy(id="span[id='a-autoid-29-announce']")
 WebElement MemorySize;
 
 @FindBy(xpath="input[value='Add to Cart']")
 WebElement AddCart;
 
 @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[1]"
 		+ "/div/div[2]/div[2]/div[2]/div/div/div/span/span[2]/span/button")
 WebElement Nothanks;
 
 @FindBy(xpath="//span[text()='Proceed to checkout (4 items)']")
 WebElement Checkout;
 
 @FindBy(xpath="//h1[text()='Select a payment method']")
 WebElement PaymentMethod;
 
 @FindBy(id="pp-Iib3BB-71")
 WebElement CheckingAccount;
 
public void ClickDiserProduct() {
	DiserProduct.click();}

public String GetColorText() {
	return color.getText();
}

public String GetSizeText() {
	return SizeText.getText();
	
}
public String GetInitialCostText() {
	return InitialCost.getText();
	
}
public String GetMonthlyCostText() {
	return MonthlyCost.getText();}

public void ClickRedColor() {
	RedColor.click();
}

public void ClickMemorySize() {
	MemorySize.click();
}

public void ClickAddCart() {
	AddCart.click();
}
public void ClickNOThanks() {
	Nothanks.click();
}
public void ClickCheckOut() {
	Checkout.click();
}
public String getPaymentMethodText() {
	return PaymentMethod.getText();
}
public void ClickCheckingAccount() {
	CheckingAccount.click();
}

}