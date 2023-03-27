package week4.day4;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	@Test(priority=1)
	public void datas(){
	System.out.println("M1");
	}
	@Test(invocationCount=4,invocationTimeOut=1000)
	public void data(){
	System.out.println("create Lead");
	}
	
	@Test(priority=2,enabled=false)
	public void m3(){
	System.out.println("M3");
	}
	@Test(priority=-1,invocationCount=4)
	public void data1(){
	System.out.println("M4");
	}
}
