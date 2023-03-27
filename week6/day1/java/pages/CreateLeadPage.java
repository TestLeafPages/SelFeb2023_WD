package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class CreateLeadPage extends BaseClass{

	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	return this;
	
	}


	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
	return this;
	}


	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
	return this;
	}


	public ViewLead clickOnCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLead();
	}
}
