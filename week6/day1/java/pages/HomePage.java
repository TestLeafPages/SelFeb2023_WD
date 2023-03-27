package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class HomePage extends BaseClass {

	
	public MyHomePage clickOnCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//m2
		return new MyHomePage();
		
	}
	
	
public LoginPage logoutButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	
	return new LoginPage();
	}
}
