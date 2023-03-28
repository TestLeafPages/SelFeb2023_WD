package retryTestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public ChromeDriver driver;
@BeforeMethod
public void perCondition() {
	ChromeOptions options = new ChromeOptions();

	options.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	}





@AfterMethod
public void postCondition() {
	driver.close();
	
}
	
	
	
	
	
}
