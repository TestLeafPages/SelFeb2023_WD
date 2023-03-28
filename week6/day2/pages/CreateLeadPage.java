package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;

public class CreateLeadPage extends BaseClass{

public CreateLeadPage(RemoteWebDriver driver) {
	this.driver=driver;
	}
	
	
	
	
	
	public CreateLeadPage enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	return this;
	
	}


	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	return this;
	}


	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	return this;
	}


	public ViewLead clickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLead(driver);
	}
}
