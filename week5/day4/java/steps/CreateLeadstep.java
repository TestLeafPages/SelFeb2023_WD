package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateLeadstep extends BaseClass {

	
	@Given("Click On Crmsfa And Click on Leads")
	public void clickmethod() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
		
	@And("Click on Create Leads link")
	public void clickOnCreatebutton() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And("Enter Company Name as (.*)$")
	public void enterCompanyName(String cn) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
	}
	
	@And("Enter First Name as (.*)$")
	public void enterFirstName(String Fn) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fn);
	}
	
	@And("Enter Last Name as (.*)$")
	public void enterLastName(String Ln) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Ln);
	}
	
	@Then("Click on Create Leads button")
	public void clickonCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
}
