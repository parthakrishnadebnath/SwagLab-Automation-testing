package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrder extends BasePage{

	public PlaceOrder(WebDriver driver) {
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
	 private WebElement addToCart;
	 @FindBy(xpath="//a[@class='shopping_cart_link']")
	 private WebElement cartLink;
	 @FindBy(xpath="//button[@id='checkout']")
	 private WebElement checkOut;
	 @FindBy(xpath="//input[@id='first-name']")
	 private WebElement firstName;
	 @FindBy(xpath="//input[@id='last-name']")
	 private WebElement lastName;
	 @FindBy(xpath="//input[@id='postal-code']")
	 private WebElement zip;
	 @FindBy(xpath="//input[@id='continue']")
	 private WebElement cntn;
	 @FindBy(xpath="//button[@id='finish']")
	 private WebElement finish;
	 
	 public void enterUsername() {
		 username.sendKeys("standard_user");
	 }
	 public void enterPassword() {
		 password.sendKeys("secret_sauce");
	 }
	 public void login() {
		 login.click();
	 }
	 public void addToCart() {
		 addToCart.click();
	 }
	 public void cartLink() {
		 cartLink.click();
	 }
	 public void checkOut() {
		 checkOut.click();
	 }
	 public void Name1() {
		 firstName.sendKeys("testname1");
	 }
	 public void Name2() {
		 lastName.sendKeys("testname2");
	 }
	 public void postalCode() {
		 zip.sendKeys("12345");
	 }
	 public void cntnue() {
		 cntn.click();
	 }
	 public void fnsh() {
		 finish.click();
	 }
	 

}
