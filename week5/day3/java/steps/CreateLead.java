package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class CreateLead {
	public ChromeDriver driver;

	@Given("Click On Crmsfa")
	public void click() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
