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

public class ClickOnResourcesTab extends BaseClass {

	@Test(priority = 1)

	public void ClickOnResourcestab() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement ClickOnResourcestab = driver.findElement(By.xpath("//li[@id='menu-item-5219']//a[@href='#']"));
		action.moveToElement(ClickOnResourcestab).click().build().perform();

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

	public void clickBlogLink() {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement clickBlogLink = driver.findElement(By.xpath("//li[@id='menu-item-5220']//a[normalize-space()='Blog']"));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id='menu-item-5220']//a[normalize-space()='Blog']")));
		action.moveToElement(clickBlogLink).click().build().perform();


		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/blog/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Digital Marketing Blog – Digital Web Solutions";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	@Test(priority = 3)

	public void testimonialLink() throws InterruptedException {
	//	Actions action = new Actions(driver);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		Thread.sleep(3000);
		WebElement testimonialLink = driver.findElement(By.xpath("//li[@id='menu-item-5222']//a[normalize-space()='Testimonials']"));
		// handled stale element with for loop
				for (int i = 0; i <= 2; i++) {
					try {
						js.executeAsyncScript("arguments[0].click();", testimonialLink);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
		//action.moveToElement(infoGraphicDesignLink).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/testimonials/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Testimonials - Digital Web Solutions";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}
	@Test(priority = 4)

	public void sopLink() throws InterruptedException {
	//	Actions action = new Actions(driver);
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
		Thread.sleep(3000);
		WebElement sopLink = driver.findElement(By.xpath("//li[@id='menu-item-9857']//a[normalize-space()='SOPs']"));
		// handled stale element with for loop
				for (int i = 0; i <= 2; i++) {
					try {
						js.executeAsyncScript("arguments[0].click();", sopLink);
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
		//action.moveToElement(infoGraphicDesignLink).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/sops/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "SOPs |";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");

		soft.assertAll();

	}

}
