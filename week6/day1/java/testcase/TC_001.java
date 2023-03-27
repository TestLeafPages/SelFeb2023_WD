package testcase;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass{

	@Test
	public void loginData() { 
		
		
		LoginPage lp= new LoginPage();
		lp.enterUserName().enterPassword()
		.clickOnLoginButton().logoutButton();
	}
}
