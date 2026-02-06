package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

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

}
}