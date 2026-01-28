package testCase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginPageTest extends BaseClass {

    @Test
    public void loginTest() throws IOException {
        LoginPage lp = new LoginPage(driver);
        lp.enterUsername();
        lp.enterPassword();
        lp.clickLogin();
        
        TakesScreenshot ts=(TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("E:\\SauceDemo\\LoginPage.png"));
    }
}
