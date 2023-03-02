package week2.day4;

public class ReturnType {

	
	public void name() {
		System.out.println("Hi");
	}
	
	public boolean taskCompleted() {
		return false;
		
		
	}
	
	public int age() {
		return 34;
		
	}
	
	
	public static void main(String[] args) {
		
		ReturnType rt= new ReturnType();
		rt.name();
		boolean taskCompleted = rt.taskCompleted();
		
		System.out.println(taskCompleted);
		int age = rt.age();
		System.out.println(age);
	}

}
