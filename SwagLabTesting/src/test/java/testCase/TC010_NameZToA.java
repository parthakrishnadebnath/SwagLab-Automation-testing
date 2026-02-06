package testCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.NameZtoA;
import testBase.BaseClass;

public class TC010_NameZToA extends BaseClass{
	
	@Test
	public void nameZToA() {
		
		NameZtoA za=new NameZtoA(driver);
		za.enterUsername();
		za.enterPassword();
		za.login();
		za.dropdownLink();
		za.zToa();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(f, new File("E:\\SauceDemo\\ZtoA.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
