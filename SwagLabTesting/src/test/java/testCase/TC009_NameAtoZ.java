package testCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.NameAtoZ;
import testBase.BaseClass;

public class TC009_NameAtoZ extends BaseClass {
	
	@Test
	public void aToz() {
		NameAtoZ az=new NameAtoZ(driver);
		az.enterPassword();
		az.enterUsername();
		az.login();
		az.dropdownLink();
		az.aToz();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(f, new File("E:\\SauceDemo\\AtoZ.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
