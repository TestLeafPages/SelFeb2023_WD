package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class HomePage extends BaseClass {

	
public HomePage(RemoteWebDriver driver) {
	this.driver=driver;
	}
	
	
	public MyHomePage clickOnCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//m2
		return new MyHomePage(driver);
		
	}
	
	
public LoginPage logoutButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	
	return new LoginPage(driver);
	
	
	}
}
