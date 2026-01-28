package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage {

    public AddToCart(WebDriver driver) {
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
 
}
 
 
 
 
 
 
 

    // @FindBy(id="//input[@id='password']")
    // private WebElement password;

    // @FindBy(id="//input[@id='login-button']")
    // private WebElement loginBtn;

	//private By usernameField = By.id("user-name");
   // private By passwordField = By.id("password");
   // private By loginButton = By.id("login-button");

  

   // public void enterUsername(String username) {
    //    driver.findElement(usernameField).sendKeys(username);
    //}

    //public void enterPassword(String password) {
      //  driver.findElement(passwordField).sendKeys(password);
    //}

    //public void clickLogin() {
      //  driver.findElement(loginButton).click();
   // }
