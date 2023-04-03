package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class MyHomePage1 extends BaseClass {




	public MyLeadsPage1 clickOnLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage1();
	}
}
