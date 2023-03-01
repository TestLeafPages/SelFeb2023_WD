package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[2]")).click();

	}

}
