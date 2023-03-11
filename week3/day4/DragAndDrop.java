package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.manage().window().maximize();
	
	driver.get("https://www.leafground.com/drag.xhtml");
	
	WebElement scr = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
	
	WebElement trg = driver.findElement(By.xpath("//div[@id='form:drop']"));
	
	
	//step1
	Actions bulider= new Actions(driver);
	
	
	//step2
	bulider.dragAndDrop(scr, trg).perform();
}
}
