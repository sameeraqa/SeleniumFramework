package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.LogData;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
	  LoginPage loginpage=new LoginPage(driver);
	  LogData.info("Starting Login Test");
	  loginpage.enterUsername("admin@yourstore.com");
	  loginpage.enterPwd("admin");
	  loginpage.clickLogin();
	  String title=driver.getTitle();
	  LogData.info("Verifying Page Title:"+title);
	  Assert.assertEquals(title, "Just a moment...");
	  
	}

}
