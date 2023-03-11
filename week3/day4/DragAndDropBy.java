package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement dropby = driver.findElement(By.id("form:conpnl_content"));
		Actions bul=new Actions(driver);
		
		Thread.sleep(3000);
		bul.dragAndDropBy(dropby, 100, 100).perform();
	}

}
