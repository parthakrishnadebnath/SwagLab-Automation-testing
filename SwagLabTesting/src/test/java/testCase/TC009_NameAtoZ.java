package testCase;

import org.testng.annotations.Test;

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
	}

}
