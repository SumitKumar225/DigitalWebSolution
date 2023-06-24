package digitalWebSolution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

public class ClickOnDevelopmentTab extends BaseClass {

	@Test(priority = 1)

	public void clickDevelopmentTab() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement developmentTab = driver.findElement(By.xpath("//li[@id='menu-item-7603']//a[@href='#']"));
		action.moveToElement(developmentTab).click().build().perform();

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

	public void clickWebDevelopmentLink() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement clickWebDevelopmentLink = driver.findElement(By.xpath("//li[@id='menu-item-5562']//a[normalize-space()='Web Development']"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id='menu-item-5562']//a[normalize-space()='Web Development']")));
		action.moveToElement(clickWebDevelopmentLink).click().build().perform();


		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/website-design-and-development/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Web Design Services and Website Development Company - DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	@Test(priority = 3)

	public void infoGraphicDesignLink() throws InterruptedException {
	//	Actions action = new Actions(driver);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		Thread.sleep(3000);
		WebElement infoGraphicDesignLink = driver.findElement(By.xpath("//li[@id='menu-item-5233']//a[normalize-space()='Infographic Design']"));
		// handled stale element with for loop
				for (int i = 0; i <= 2; i++) {
					try {
						js.executeAsyncScript("arguments[0].click();", infoGraphicDesignLink);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
		//action.moveToElement(infoGraphicDesignLink).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/development-and-creatives/infographic-services/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Infographics Design Services for Agencies - DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	@Test(priority = 4)

	public void landingPageLink() throws InterruptedException {
	//	Actions action = new Actions(driver);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		Thread.sleep(3000);
		WebElement landingPageLink = driver.findElement(By.xpath("//li[@id='menu-item-5213']//a[normalize-space()='Landing Page Design']"));
		// handled stale element with for loop
				for (int i = 0; i <= 2; i++) {
					try {
						js.executeAsyncScript("arguments[0].click();", landingPageLink);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
		//action.moveToElement(infoGraphicDesignLink).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/bespoke-landing-page-design-and-development/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Bespoke Landing Page Design And Development for Agencies – DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}

}
