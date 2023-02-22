package week1.day1;

public class LearningMethod {

	//Accessmodifier Returntype  name()
	
   //method name-ctrl+space---method stub
	
	//global variable
	int d=5;
	
	public void totalStudents() {
		System.out.println("total number of students : 19");
	}
	
	public void courseName() {
		System.out.println("Java Introduction");
		
		System.out.println(d);
		
		//localvariable cannot print in other methods
		//System.out.println(c);
	}
	
	
	public void studentPresent(int a,int b) {
		//c-is local variable
		
		int c=a-b;
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		//syntax: classname objectname= new classname();
		
		
		LearningMethod obj= new LearningMethod();
		
		obj.totalStudents();
		obj.courseName();
		obj.studentPresent(20, 25);
			
		
	}


	
}
