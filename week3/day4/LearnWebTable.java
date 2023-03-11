package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		
		System.out.println(text);
		
		String data2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr")).getText();
		System.out.println(data2);
		
		
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr/td[1]"));
		int row = name.size();
		System.out.println(row);
		
		List<WebElement> name1 = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr[1]/td"));
		int col = name1.size();
		System.out.println(col);
		
		for (int i = 1; i <=row; i++) {
			
			for(int j=1;j<=col;j++) {
			 String data3 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table//tr["+i+"]/td["+j+"]")).getText();
			 
			 System.out.println(data3);
			}
		}
		
		
		String text2 = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[4]")).getText();
		
		System.out.println(text2);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
