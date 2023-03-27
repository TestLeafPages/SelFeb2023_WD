package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseclass.BaseClass;

public class ViewLead extends BaseClass {

	
	public ViewLead verifyLead() {
		
		String actual="Dilip";
		String expect = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	     Assert.assertEquals(actual, expect);
	     System.out.println("passed");
	     return this;
	
	}
}
