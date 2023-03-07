package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("earbuds",Keys.ENTER);
		
		
		List<WebElement> allprice = driver.findElements(By.className("a-price-whole"));
		
		List<Integer>allearbuds=new ArrayList<Integer>();
		
		
		for (int i = 0; i <allprice.size(); i++) {
			String text = allprice.get(i).getText();
			String replaceAll = text.replaceAll(",", "");
			System.out.println(replaceAll);
			if(!replaceAll.trim().equals("")) {
				int finalprice = Integer.parseInt(replaceAll);
				if(finalprice>0) {
					allearbuds.add(finalprice);
				}
			}
		}
		Collections.sort(allearbuds);
		System.out.println("lowest price: "+ allearbuds.get(0));
	}

}
