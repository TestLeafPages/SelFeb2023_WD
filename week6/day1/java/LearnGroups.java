package week4.day4;

import org.testng.annotations.Test;

public class LearnGroups {

	@Test(groups="Smoke")
	public void m1(){
	System.out.println("Create Lead");
	}
	@Test(groups="sanity")
	public void m2(){
	System.out.println("edit lead");
	}
	
	@Test(groups="Smoke")
	public void m3(){
	System.out.println("Duplicate lead");
	}
	
	
	@Test(groups="Smoke")
	public void dc1(){
	System.out.println("Delete lead");
	}
}
