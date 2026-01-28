package testCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.AddToCart;
import testBase.BaseClass;

public class TC002_AddToCartTest extends BaseClass{
	@Test
	public void addToCart() throws IOException {
		AddToCart ac=new AddToCart(driver);
		ac.enterUsername();
		ac.enterPassword();
		ac.login();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\SauceDemo\\LandingPage.png"));
		
		
		ac.addToCart();
		ac.cartLink();
		
		File fl=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(fl, new File("E:\\SauceDemo\\CartPage.png"));
		
		ac.checkOut();
		
		File f1=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("E:\\SauceDemo\\CheckOutPage.png"));
	}

}

