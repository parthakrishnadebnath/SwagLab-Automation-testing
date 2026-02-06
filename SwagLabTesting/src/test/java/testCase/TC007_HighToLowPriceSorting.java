package testCase;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.HighToLowPrice;
import testBase.BaseClass;



public class TC007_HighToLowPriceSorting extends BaseClass{
	
	@Test
	public void highToLowPrice() throws IOException {
		HighToLowPrice hl=new HighToLowPrice(driver);
		hl.enterUsername();
		hl.enterPassword();
		hl.login();
		hl.dropdownLink();
		hl.selectHighToLow();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\SauceDemo\\HighToLow.png"));
	}

}
