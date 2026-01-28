package testCase;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




import pageObjects.BrokenLink;
import testBase.BaseClass;

public class TC003_BrokenLinkTest extends BaseClass{
	private String linkUrl;

	@Test
	public void addToCart()  {
		BrokenLink ac=new BrokenLink(driver);
		ac.enterUsername();
		ac.enterPassword();
		ac.login();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//List<String> urlList= new ArrayList<String>();
		 for(WebElement e: links) {
			 String url=e.getAttribute("href");
			// urlList.add(url1);
		 }
		 
		// System.out.println(1);
		 
		 try {
			 
			 URL url=new URL (linkUrl);
			 
			 HttpURLConnection connection= (HttpURLConnection) url.openConnection();
			 connection.connect();
			 
			 if(connection.getResponseCode()==200){
				 System.out.println(connection.getResponseMessage() + "" + "is not a broken link");
				 
			 }
			 else {
				 System.out.println(links);
			 }
			 
		 }
		 catch(Exception e){}
		// System.out.println(2);
		 
		// System.out.println("number of links" +urlList.size());
		 
		// public void static brokenlink() {
			 
		 }
		
	}
