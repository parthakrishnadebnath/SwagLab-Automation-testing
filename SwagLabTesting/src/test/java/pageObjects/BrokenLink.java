package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLink extends BasePage {

    public BrokenLink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
 @FindBy(xpath="//input[@placeholder='Username'][@id='user-name']")
 private WebElement username;
 @FindBy(xpath="//input[@placeholder='Password'][@id='password']")
 private WebElement password;
 @FindBy(xpath="//input[@id='login-button'][@value='Login']")
 private WebElement login;
 
 
 public void enterUsername() {
	 username.sendKeys("standard_user");
 }
 public void enterPassword() {
	 password.sendKeys("secret_sauce");
 }
 public void login() {
	 login.click();
 }
}