package testcase;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass{

	@Test
	public void loginData() throws InterruptedException { 
		
		System.out.println(driver);
		
		LoginPage lp= new LoginPage(driver);
		lp.enterUserName("Demosalesmanager").enterPassword("crmsfa")
		.clickOnLoginButton().logoutButton();
	}
}
