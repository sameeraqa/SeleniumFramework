package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsername("admin@yourstore.com");
	  loginpage.enterPwd("admin");
	  loginpage.clickLogin();
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Just a moment...");
	  System.out.println("The Title of page "+title);
	  
	}

}
