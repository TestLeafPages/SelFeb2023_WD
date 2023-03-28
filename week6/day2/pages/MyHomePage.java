package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class MyHomePage extends BaseClass {

public MyHomePage(RemoteWebDriver driver) {
	this.driver=driver;
	}
	
	
	



	public MyLeadsPage clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
		
		return new MyLeadsPage(driver);
	}
}
