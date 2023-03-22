package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	public ChromeDriver driver;
	
	@Given("Launch the browser and maximize and load the url")
	public void precondtion() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter the username as {string}")
	public void enterusername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	
	@And("Enter the password as {string}")
	public void enterpassword(String password){
		driver.findElement(By.id("password")).sendKeys(password);

	}
	
	@When("Click on the login button")
	public void loginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	
	@Then("Verify that login is successful")
	public void verifytitle() {
		
		String title="Leaftaps - TestLeaf Automation Platform";

		String exptitle = driver.getTitle();
		//1st
		Assert.assertEquals(title, exptitle);
	}
	
	@But("Verify condition failed")
	public void titlenotmatch() {
		String title="Leaftaps - TestLeaf Automation";

		String exptitle = driver.getTitle();
		//1st
		Assert.assertEquals(title, exptitle);
	}
	
	
}
