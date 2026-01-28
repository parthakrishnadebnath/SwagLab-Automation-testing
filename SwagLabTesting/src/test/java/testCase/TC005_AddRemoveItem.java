package testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.AddRemoveItem;
import testBase.BaseClass;

public class TC005_AddRemoveItem extends BaseClass{
	
	@Test
	public void addRemoveItem() throws IOException {
		AddRemoveItem ar=new AddRemoveItem(driver);
		ar.enterUsername();
		ar.enterPassword();
		ar.login();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		ar.addToCart1();
		ar.cartLink();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		ar.continueShopping();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		ar.addToCart2();
		ar.cartLink();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\SauceDemo\\Cart.png"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		ar.remove1();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		ar.remove2();
		
		File f1=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("E:\\SauceDemo\\Cartremove.png"));
	}

}
