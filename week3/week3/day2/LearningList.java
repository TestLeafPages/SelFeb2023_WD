package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningList {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/link.xhtml");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int size = links.size();
		System.out.println("total link is presents :"+ size);
		
		for (int i = 0; i < links.size(); i++) {
			
			WebElement name = links.get(i);
			String text = name.getText();
			System.out.println(text);
		}
	}

}
