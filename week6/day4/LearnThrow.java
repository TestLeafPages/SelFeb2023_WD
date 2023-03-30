package baseclass;

import org.testng.annotations.Test;

public class LearnThrow {

	@Test
	public void CreateLead() {
		System.out.println("Test A");
		throw new RuntimeException("Verify the dependency");
	}
	
	
	
	@Test(dependsOnMethods="CreateLead",alwaysRun=true)
	public void DeleteLead() {
		System.out.println("Test B");
	}
	
	
	
	

}
