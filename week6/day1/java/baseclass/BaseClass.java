package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
public static RemoteWebDriver driver;	
	
@BeforeMethod
public void perCondition() {
		
		ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

@AfterMethod
public void postCondition() {
	driver.close();
}
}