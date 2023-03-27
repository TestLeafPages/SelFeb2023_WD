package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{

	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		//m1
//		LoginPage lp= new LoginPage();
//		return lp;
		
		//m2
		return this;
		
		
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}


	public HomePage clickOnLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//m1
//		HomePage hp= new HomePage();
//		return hp;
		//m2
		
		return new HomePage();
	}
	
}
