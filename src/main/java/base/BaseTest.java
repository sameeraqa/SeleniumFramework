package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.LogData;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	driver=new ChromeDriver();
	LogData.info("Starting Chrome Driver");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login");
	LogData.info("Application Url loaded "+driver.getCurrentUrl());
		
	}
	
	@AfterMethod
	public void teatDown() {
		if(driver!=null) {
			LogData.info("Closing Browser");
			driver.quit();
		}
	}

}
