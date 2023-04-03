package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;
import pages.LoginPage1;

public class TC_002 extends BaseClass {

	@BeforeTest
	public void getdata() {	
		test="CreteLead";
		testName="CreteLead Funtionality";
		testDesc="Lead with Mandatory data";
		author="Mayuri";
		category="Regression";
		datafile="CreateLead(1)";
	}	
		
	@Test(dataProvider="fetch")
	public void createLead(String companyName,String fName,String lName) throws InterruptedException, IOException {
		System.out.println(driver);
		new LoginPage1().enterUserName("Demosalesmanager").enterPassword("crmsfa")
		.clickOnLoginButton()
		.clickOnCrmsfa().clickOnLeads()
		.clickOnCreateLead()
		.enterCompanyName(companyName).enterFirstName(fName)
		.enterLastName(lName).clickOnCreateLeadButton()
		.verifyLead();
	}
	
	
	
}
