package week1.day2;

public class LearningDataType {

	public int add(int a,int b) {
		return a+b;
	}
		
	
	
	public float mul(float a,float b) {
		
		return a*b;
		
	}
	
	
	public boolean pass() {
		return true;
		
	}
	
	public static void main(String[] args) {
		
		
		LearningDataType dt= new LearningDataType();
		
		
		//ctrl+2--l
		//method 1
		 int add = dt.add(4, 9);
		System.out.println(add);
		
		//method 2
		//System.out.println(dt.mul(2.5f, 6.6f));
		float mul = dt.mul(2.5f, 6.6f);
		
		System.out.println(mul);
		
		System.out.println(dt.pass());
	}
	
	
	
}
