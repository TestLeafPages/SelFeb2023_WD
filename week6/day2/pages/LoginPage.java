package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(RemoteWebDriver driver) {
		
		this.driver=driver;
		//this.stuname= stuname;
	}

	public LoginPage enterUserName(String username) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		//m1
//		LoginPage lp= new LoginPage();
//		return lp;
		//m2
		return this;
		
		
		
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}


	public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//m1
//		HomePage hp= new HomePage();
//		return hp;
		//m2
		
		return new HomePage(driver);
	}
	
}
