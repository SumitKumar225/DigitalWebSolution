package digitalWebSolution;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

public class LaunchURL extends BaseClass {
	
	
	@Test
	
	public void launchURL()
	{	
		
		//validate URL
		SoftAssert soft=new SoftAssert();
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		String expectedURL="https://www.digitalwebsolutions.com/";
		soft.assertEquals(actualURL, expectedURL, "URL mismatched");
		
		//Validate Title
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Digital Marketing Agency | Digital Web Solutions";
		soft.assertEquals(actualTitle, expectedTitle, "Title not matched");
		soft.assertAll();
	}
}
