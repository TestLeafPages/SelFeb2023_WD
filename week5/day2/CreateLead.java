package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{

	@BeforeTest
	public void getdata() {
		
		datafile="CreateLead";
	}
	
	
	
	@Test(dataProvider="fetch")
	
	public  void createdata(String cn,String fn,String ln,String ph) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	
	
	
	
	
	
	
}






