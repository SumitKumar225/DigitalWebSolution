package digitalWebSolution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

public class ClickOnWhiteLabelSolution extends BaseClass {

	@Test(priority = 1)

	public void ClickOnWhiteLabelSolution() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement ClickOnWhiteLabelSolution = driver.findElement(By.xpath("//li[@id='menu-item-5214']//a[@href='#']"));
		action.moveToElement(ClickOnWhiteLabelSolution).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/#";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Digital Marketing Agency | Digital Web Solutions";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}

	@Test(priority = 2)

	public void clickOutsourcedDigitalMarketingServices() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement clickOutsourcedDigitalMarketingServices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-5215']//a[normalize-space()='Outsourced Digital Marketing Services']")));
		action.moveToElement(clickOutsourcedDigitalMarketingServices).click().build().perform();


		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/outsourced-digital-marketing-services/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Outsourced Digital Marketing Services - DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	@Test(priority = 3)

	public void SeoReseller() throws InterruptedException {
	//	Actions action = new Actions(driver);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		Thread.sleep(3000);
		WebElement SeoReseller = driver.findElement(By.xpath("//li[@id='menu-item-7809']//a[normalize-space()='Seo Reseller']"));
		// handled stale element with for loop
				for (int i = 0; i <= 2; i++) {
					try {
						js.executeAsyncScript("arguments[0].click();", SeoReseller);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
		//action.moveToElement(infoGraphicDesignLink).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/seo-reseller/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "White Label SEO Reseller Services - Digital Web Solutions";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	


}
