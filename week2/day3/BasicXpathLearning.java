package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpathLearning {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//attribute based xpath
		//ctrl+2--L
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		//partial attribute based xpath
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		//partial text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		
driver.close();
	}

}
