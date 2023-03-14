package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWaits {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();

//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10);
		//wait.until();
		
		
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		String text = until.getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement invisi = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		
		
		WebDriverWait w2= new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean until1 = w2.until(ExpectedConditions.invisibilityOf(invisi));
		System.out.println(until1);
		
		//w2.until(ExpectedConditions.numberOfWindowsToBe(2))
		
	}

}
