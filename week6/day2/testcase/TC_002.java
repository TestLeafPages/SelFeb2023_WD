package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class TC_002 extends BaseClass {

	@BeforeTest
	public void getdata() {
		
		datafile="CreateLead";
	}
	
	
	
	@Test(dataProvider="fetch")
	public void createLead(String companyName,String fName,String lName) throws InterruptedException {
		
		System.out.println(driver);
		new LoginPage(driver).enterUserName("Demosalesmanager").enterPassword("crmsfa")
		.clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads()
		.clickOnCreateLead()
		.enterCompanyName(companyName).enterFirstName(fName)
		.enterLastName(lName).clickOnCreateLeadButton()
		.verifyLead();
	}
	
	
	
}
