package testCase;



import org.testng.annotations.Test;

import pageObjects.HighToLowPrice;
import testBase.BaseClass;


@Test
public class TC007_HighToLowPriceSorting extends BaseClass{
	
	public void highToLowPrice() {
		HighToLowPrice hl=new HighToLowPrice(driver);
		hl.enterUsername();
		hl.enterPassword();
		hl.login();
		hl.dropdownLink();
		hl.selectHighToLow();
	}

}
