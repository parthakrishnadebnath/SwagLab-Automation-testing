package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

   // @FindBy(id="//input[@id='user-name']")
   // private WebElement username;

   // @FindBy(id="//input[@id='password']")
   // private WebElement password;

   // @FindBy(id="//input[@id='login-button']")
   // private WebElement loginBtn;

    public void enterUsername() {
        driver.findElement(By.xpath("//input[@placeholder='Username'][@id='user-name']")).sendKeys("standard_user");
    }

    public void enterPassword() {
    	driver.findElement(By.xpath("//input[@placeholder='Password'][@id='password']")).sendKeys("secret_sauce");
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//input[@id='login-button'][@value='Login']")).click();
    }
}
