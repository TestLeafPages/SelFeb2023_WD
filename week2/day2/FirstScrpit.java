package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class FirstScrpit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		EdgeDriver driver1= new EdgeDriver();
		driver1.get("https://www.google.com");
	}

}
