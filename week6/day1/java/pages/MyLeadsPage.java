package pages;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class MyLeadsPage extends BaseClass{

	
	public CreateLeadPage clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLeadPage();
	}
}
