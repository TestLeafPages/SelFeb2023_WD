package testcase;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass {

	@Test
	public void createLead() {
		
		new LoginPage().enterUserName().enterPassword()
		.clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads()
		.clickOnCreateLead()
		.enterCompanyName().enterFirstName()
		.enterLastName().clickOnCreateLeadButton()
		.verifyLead();
	}
	
	
	
}
