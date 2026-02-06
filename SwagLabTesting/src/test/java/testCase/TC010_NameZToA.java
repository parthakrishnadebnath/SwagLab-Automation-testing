package testCase;

import org.testng.annotations.Test;

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
	}

}
