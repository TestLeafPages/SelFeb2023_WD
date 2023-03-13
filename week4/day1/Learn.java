package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Learn {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//we need swtich to frist frame
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		//2nd second frame
		driver.switchTo().frame("frame2");
		
		
		
		driver.findElement(By.id("Click")).click();
		Thread.sleep(3000);
		

		
		driver.close();
	}

}
