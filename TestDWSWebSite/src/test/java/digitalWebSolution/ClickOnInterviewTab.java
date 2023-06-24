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
import net.bytebuddy.asm.Advice.Argument;

public class ClickOnInterviewTab extends BaseClass {

	@Test(priority = 1)

	public void ClickOnInterviewTabtab() throws InterruptedException {
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement ClickOnResourcestab = driver.findElement(By.xpath("(//li[@id=\"menu-item-9495\"]//a[@href='https://www.digitalwebsolutions.com/interviews/'])[1]"));
		action.moveToElement(ClickOnResourcestab).click().build().perform();

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/interviews/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Interviews with Digital Marketing Industry Experts";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");
		
		Thread.sleep(5000);
		WebElement closeButton=driver.findElement(By.xpath("//a[@id='btnClose1']"));
		for(int i=0;i<=2;i++) {
			try {
		js.executeScript("argument[0].click();", closeButton);
		break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		soft.assertAll();

	}

	@Test(priority = 2)

	public void clickChrisDreyer() throws InterruptedException {
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		SoftAssert soft = new SoftAssert();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement clickChrisDreyer = driver.findElement(By.xpath("//li[@id='menu-item-9496']//a[normalize-space()='Chris Dreyer']"));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id='menu-item-9496']//a[normalize-space()='Chris Dreyer']")));
		//Thread.sleep(2000);
		for(int i=0;i<=2;i++) {
			try
			{
				js.executeAsyncScript("arguments[0].click();", clickChrisDreyer);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		}

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/interview/chris-dreyer/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Interview with Chris Dreyer | CEO of Rankings.io | DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");
		
		Thread.sleep(5000);
		WebElement closeButton= driver.findElement(By.xpath("//a[@id='btnClose1']"));
		for(int i=0;i<=2;i++) {
			try {
		js.executeScript("argument[0].click();", closeButton);
		break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		soft.assertAll();

	}
	@Test(priority = 3)

	public void clickTravis() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SoftAssert soft = new SoftAssert();
		WebElement clickTravis = driver.findElement(By.xpath("//li[@id='menu-item-9497']//a[contains(text(),'Travis Bliffen')]"));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id='menu-item-9497']//a[contains(text(),'Travis Bliffen')]")));
		//action.moveToElement(clickChrisDreyer).click().build().perform();
		for(int i=0;i<=2;i++) {
			try
			{
				js.executeAsyncScript("arguments[0].click();", clickTravis);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		}

		// Validate URL
		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.digitalwebsolutions.com/interview/travis-bliffen/";

		soft.assertEquals(actualURL, expectedUrl, "URL mismatched");

		// Validate title
		String actualTitle = driver.getTitle();
		String homeTitle = "Interview with Travis Bliffen | CEO Stellar SEO | DWS";
		soft.assertEquals(actualTitle, homeTitle, "title not matched");
		
		Thread.sleep(5000);
		WebElement closeButton= driver.findElement(By.xpath("//a[@id='btnClose1']"));
		for(int i=0;i<=2;i++) {
			try {
		js.executeScript("argument[0].click();", closeButton);
		break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		soft.assertAll();

	}
}
