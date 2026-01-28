package testCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.PlaceOrder;
import testBase.BaseClass;

public class TC004_PlaceOrder extends BaseClass{
	
	@Test
	public void placeOrder() throws IOException {
		PlaceOrder po=new PlaceOrder(driver);
		po.enterUsername();
		po.enterPassword();
		po.login();
		po.addToCart();
		po.cartLink();
		po.checkOut();
		po.Name1();
		po.Name2();
		po.postalCode();
		po.cntnue();
		po.fnsh();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\SauceDemo\\PlaceOrder.png"));
	}
	
	

}
