package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/window.xhtml;");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		
		//getWindowHandle()
		String windowname = driver.getWindowHandle();
		System.out.println(windowname);
		
		//m-2
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//convert set into list
		
	List<String>windows= new ArrayList<String>(windowHandles);
	
	System.out.println("total window opend"+windows.size());
		
		//using get method
	//index start with '0'
	driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dilip@testleaf.com");
		
		//switch to first window
		
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>window1=new ArrayList<String>(windowHandles2);
		
		int size = window1.size();
		System.out.println(size);
		
		driver.switchTo().window(window1.get(3));
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
