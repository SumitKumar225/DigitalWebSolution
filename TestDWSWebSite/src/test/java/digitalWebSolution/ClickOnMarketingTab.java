package digitalWebSolution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;

public class ClickOnMarketingTab extends BaseClass {

	
	@Test(priority = 1)

	public void digitalMarketing() throws InterruptedException {

		SoftAssert soft = new SoftAssert();
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();
		Thread.sleep(5000);
		WebElement digitalmarketing = driver.findElement(By.xpath(locators.getProperty("digitalmarketing")));
		action.moveToElement(digitalmarketing).click().build().perform();

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.digitalwebsolutions.com/digital-marketing-services/";
		soft.assertEquals(actualURL, expectedURL, "URL not matched");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Digital Marketing Services - Internet Marketing Solutions | DWS";
		soft.assertEquals(actualTitle, expectedTitle, "Title not matched");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@alt='Digital Web Solutions']")).click();
		soft.assertAll();
	}

	@Test(priority = 2)

	public void sEo() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();
		Thread.sleep(5000);
		WebElement sEo = driver.findElement(By.xpath(locators.getProperty("seo")));

		// handled stale element with for loop
		for (int i = 0; i <= 2; i++) {
			try {
				js.executeAsyncScript("arguments[0].click();", sEo);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		// action.moveToElement(sEo).click().build().perform();

		String actualURL = driver.getCurrentUrl();
		String expectedURl = "https://www.digitalwebsolutions.com/digital-marketing-services/seo/";
		soft.assertEquals(actualURL, expectedURl, "URL not matched");

		String actualTitle = driver.getTitle();
		String expectedTitle = "SEO Services: Search Engine Optimization Company - DWS";
		soft.assertEquals(actualTitle, expectedTitle, "Title Not matched");

		Thread.sleep(10000);
		driver.findElement(By.xpath(locators.getProperty("gotohome"))).click();
		soft.assertAll();

	}

	@Test(priority = 3)

	public void eCommerceSEo() throws InterruptedException {
		Actions action = new Actions(driver);
		SoftAssert soft = new SoftAssert();
		Thread.sleep(5000);
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();

		WebElement eCommerceSEo = driver.findElement(By.xpath(locators.getProperty("ecommerceseo")));
		action.moveToElement(eCommerceSEo).click().build().perform();

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.digitalwebsolutions.com/digital-marketing-services/ecommerce-seo/#";
		soft.assertEquals(actualURL, expectedURL, "URL not matched");

		String actualtitle = driver.getTitle();
		String expectedtitle = "Ecommerce SEO Services | Expert Ecommerce SEO Agency - Digital Web Solutions";
		soft.assertEquals(actualtitle, expectedtitle, "Title not matched");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@alt='Digital Web Solutions']")).click();
	}

	@Test(priority = 4)

	public void loaclSEO() throws InterruptedException {
		Actions action = new Actions(driver);
		SoftAssert soft = new SoftAssert();
		Thread.sleep(5000);
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();

		WebElement loaclSEO = driver.findElement(By.xpath(locators.getProperty("localseo")));
		action.moveToElement(loaclSEO).click().build().perform();

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.digitalwebsolutions.com/digital-marketing-services/local-seo-services/";
		soft.assertEquals(actualURL, expectedURL, "URL not matched");

		String actualtitle = driver.getTitle();
		String expectedtitle = "'Local SEO Services: Local Search Engine Optimization - DWS'";
		soft.assertEquals(actualtitle, expectedtitle, "Title not matched");

		Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@alt='Digital Web Solutions']")).click();
	}
	
	@Test (priority=5)
	
	public void payPerClick() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		SoftAssert soft = new SoftAssert();
		Thread.sleep(5000);
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();
		
		
		WebElement payPerClick=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locators.getProperty("payperclick"))));
		action.moveToElement(payPerClick).click().build().perform();
		
		
		WebElement homePage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Digital Web Solutions']")));
		action.moveToElement(homePage).click().build().perform();
	}
	@Test (priority=6)
	
	public void bloggerOutReachService() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		SoftAssert soft = new SoftAssert();
		Thread.sleep(5000);
		
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();
		
		WebElement bloggerOutReachService = driver.findElement(By.xpath(locators.getProperty("bloggerOutReachService")));
		action.moveToElement(bloggerOutReachService).click().build().perform();
		
		WebElement homePage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Digital Web Solutions']")));
		action.moveToElement(homePage).click().build().perform();
	}
	
	@Test(priority=7)
	
	public void blogContentWritingServices() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		SoftAssert soft = new SoftAssert();
		Thread.sleep(5000);
		
		WebElement marketTab = driver.findElement(By.xpath(locators.getProperty("marketingTab")));
		action.moveToElement(marketTab).click().build().perform();
		
		WebElement blogContentWritingServices = driver.findElement(By.xpath(locators.getProperty("blogContentWritingServices")));
		action.moveToElement(blogContentWritingServices).click().build().perform();
		
		WebElement homePage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Digital Web Solutions']")));
		action.moveToElement(homePage).click().build().perform();
		
	}
}
