package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Learnalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		 Alert alert=driver.switchTo().alert();
		alert.accept();
		
	String text=	driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		//confirm alert
		//2 actions
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		Alert alert2=driver.switchTo().alert();
		
		//alert2.dismiss();
		
		alert2.accept();
		
		//prompt
		//textbox+ 2buttons
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert3=	driver.switchTo().alert();
		
		
			alert3.sendKeys("Dilip");
		alert3.accept();
		
		driver.findElement(By.id("confirm_result")).getText();
		
		
		
		
		
		
		
		
	}

}
