package testCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.LowToHighPrice;
import testBase.BaseClass;

public class TC008_LowToHigh extends BaseClass {
	
	@Test
	public void lowToHigh() {

	LowToHighPrice lh=new LowToHighPrice(driver);
	lh.enterUsername();
	lh.enterPassword();
	lh.login();
	lh.dropdownLink();
	lh.selectLowToHigh();
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	try {
		Files.copy(f, new File("E:\\SauceDemo\\LowToHigh.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}