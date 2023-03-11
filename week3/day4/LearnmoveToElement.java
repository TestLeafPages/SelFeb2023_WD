package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnmoveToElement {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement moveto = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));

		//syntax
		//step1 crete object for Actions class
		
		Actions builder= new Actions(driver);
		
		//step2
		//use appropriate method to do the actions
		builder.moveToElement(moveto).perform();
		
		//.peform() is manadatarthat  the end
		
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='sdIconContainer'])[2]"));
		
		builder.scrollToElement(scroll).perform();
		scroll.click();
	}

}
