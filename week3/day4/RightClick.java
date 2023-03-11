package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ui-menuitem-link ui-submenu-link ui-corner-all ui-state-hover
		
		
		
		// TODO Auto-generated method stub
				ChromeDriver driver= new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.manage().window().maximize();
				
				driver.get("https://www.leafground.com/menu.xhtml");
			
				WebElement rightclick = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
				Actions bul=new Actions(driver);
				bul.contextClick(rightclick).perform();
	}

}
