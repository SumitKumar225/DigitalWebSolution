package base;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	public static Properties locators=new Properties();
	public static FileInputStream fis;
	
	
	@BeforeTest
	public void setUp() throws IOException
	{
		if(driver==null) 
		{	
			//System.out.println(System.getProperty("user.dir"));
			fr=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
			prop.load(fr);
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\locator.properties");
			locators.load(fis);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@AfterTest
	
	public void tearDown() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	}

	

}
