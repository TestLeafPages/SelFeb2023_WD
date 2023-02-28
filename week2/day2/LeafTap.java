package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//driver.findElement(By.locator("value");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		
		
		
	}

}
