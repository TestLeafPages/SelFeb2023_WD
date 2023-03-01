package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTap {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//driver.findElement(By.locator("value");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dilip");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		
		//select class- m1
		//visible text
		WebElement sele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select opt=new Select(sele);
		opt.selectByVisibleText("Employee");
		
		
		//m2 
		//value
		Select opt1= new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		opt1.selectByValue("CATRQ_CARNDRIVER");
		
		//index
		
		Select opt2= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		opt2.selectByIndex(5);
		
		String str="Create Lead | opentaps CRM";
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		if(str.equals(title2)) {
			System.out.println("create lead done");
		}else {
			System.out.println("create lead not done");
		}
		
		
		driver.findElement(By.name("submitButton")).click();
		
		String text = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		System.out.println(text);
		
		
		//driver.close();
	}

}
