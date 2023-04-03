package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class LoginPage1 extends BaseClass{
	 	
	//constructor
	//normal method
	@Given("Enter the username as {string}")
	public LoginPage1 enterUserName(String username) throws InterruptedException, IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(username);
			reportStep("Pass","Entered the username Successfully");
		} catch (Exception e) {
			reportStep("Fail","Entered the username is not successful " +e);		
			}	
			return this;
	}

	@Given ("Enter the password as {string}")
	public LoginPage1 enterPassword(String password) throws IOException {
		try {
		getDriver().findElement(By.id("password")).sendKeys(password);
		reportStep("Pass","Entered the password Successfully");
		}catch(Exception e) {
			reportStep("Fail","Entered the Password is not Successful" +e);
		}
		return this;
	}

	@When("Click the Login button")
	public HomePage1 clickOnLoginButton() throws IOException {
		try {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		reportStep("Pass","Clicked the Login button Successfully");

		}
		catch (Exception e)
		{
			reportStep("Fail","Clicking the Login button is not Successful" +e);

		}
		return new HomePage1();
	}
	
	
	
	
	
}
