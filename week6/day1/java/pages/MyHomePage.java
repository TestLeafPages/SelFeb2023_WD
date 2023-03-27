package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class MyHomePage extends BaseClass {

	
	public MyLeadsPage clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();
		
		return new MyLeadsPage();
	}
}
