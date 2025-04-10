package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By userName_txt = By.id("Email");
	private By pwd_txt = By.id("Password");
	private By login_btn = By.xpath("//*[@class='button-1 login-button']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String userName) {
		driver.findElement(userName_txt).clear();
		driver.findElement(userName_txt).sendKeys(userName);
	}

	public void enterPwd(String pwd) {
		driver.findElement(pwd_txt).clear();
		driver.findElement(pwd_txt).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(login_btn).click();
	}

}
