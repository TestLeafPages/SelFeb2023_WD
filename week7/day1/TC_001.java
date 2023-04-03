package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;
import pages.LoginPage1;

public class TC_001 extends BaseClass{

	@BeforeTest
	public void getdata() {	
		test="Login";
		testName="Login Funtionality";
		testDesc="Login with positive Credentials";
		author="Nidin";
		category="Regression";
		
	}	
	
	@Test
	public void loginData() throws InterruptedException, IOException {		
		System.out.println(driver);		
		LoginPage1 lp= new LoginPage1();
		lp.enterUserName("Demosalesmanager").enterPassword("crmsfa")
		.clickOnLoginButton().verifyHomePage();
	}
}
