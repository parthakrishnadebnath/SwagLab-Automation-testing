package testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.BasePage;
import pageObjects.ItemRemoveCheckout;
import testBase.BaseClass;

public class TC006_ItemRemoveCheckout extends BaseClass {
	
	
	@Test
public void itemRemoveCheckout() throws IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	ItemRemoveCheckout ir=new ItemRemoveCheckout(driver);
	ir.enterUsername();
	ir.enterPassword();
	ir.login();
	ir.addToCart();
	ir.cartLink();
	ir.remove();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("E:\\SauceDemo\\ItemRemoved.png"));
	ir.checkOut();
	ir.Name1();
	ir.Name2();
	ir.postalCode();
	ir.cntnue();
	ir.fnsh();
	
	File f1=ts.getScreenshotAs(OutputType.FILE);
	Files.copy(f1, new File("E:\\SauceDemo\\OrderPlaced.png"));
}
}
