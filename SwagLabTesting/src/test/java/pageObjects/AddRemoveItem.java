package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveItem extends BasePage {

	public AddRemoveItem(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//input[@placeholder='Username'][@id='user-name']")
private WebElement username;
@FindBy(xpath="//input[@placeholder='Password'][@id='password']")
private WebElement password;
@FindBy(xpath="//input[@id='login-button'][@value='Login']")
private WebElement login;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack'][text()='Add to cart']")
private WebElement addToCart1;
@FindBy(xpath="//a[@class='shopping_cart_link']")
private WebElement cartLink;
@FindBy(xpath="//button[@id='continue-shopping']")
private WebElement continueShopping;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
private WebElement addToCart2;
@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
private WebElement remove1;
@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
private WebElement remove2;

public void enterUsername() {
	 username.sendKeys("standard_user");
}
public void enterPassword() {
	 password.sendKeys("secret_sauce");
}
public void login() {
	 login.click();
}
public void addToCart1() {
	addToCart1.click();
}
public void cartLink() {
	 cartLink.click();
}
public void continueShopping() {
	continueShopping.click();
}
public void addToCart2() {
	addToCart2.click();
}
public void remove1() {
	remove1.click();
}
public void remove2() {
	remove2.click();
}



}
