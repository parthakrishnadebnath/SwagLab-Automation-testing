package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LowToHighPrice extends BasePage{

	public LowToHighPrice(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	

	 @FindBy(xpath="//input[@placeholder='Username'][@id='user-name']")
	 private WebElement username;
	 @FindBy(xpath="//input[@placeholder='Password'][@id='password']")
	 private WebElement password;
	 @FindBy(xpath="//input[@id='login-button'][@value='Login']")
	 private WebElement login;
	 @FindBy(xpath="//select[@class='product_sort_container']")
	 private WebElement btnDropdown;
	 
	 
	 public void enterUsername() {
		 username.sendKeys("standard_user");
	 }
	 public void enterPassword() {
		 password.sendKeys("secret_sauce");
	 }
	 public void login() {
		 login.click();
	 }
	 public void dropdownLink() {
		 btnDropdown.click();
	 }
	 
	 public void selectLowToHigh() {
		 Select select=new Select(btnDropdown);
		 select.selectByVisibleText("Price (low to high)");
	 }
	 
}
