package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	
	@BeforeMethod
	//@Given("Launch the browser and maximize and load the url")
	public void precondition() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
//	@AfterMethod
//	public void postcondition() {
//		driver.close();
//	}
}
