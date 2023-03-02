package week2.day4;

public class InputArguments {

	public void add(int a,int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	public int mul(int a,int b) {
		return a*b;
		
	}
	
	public String name() {
		return "Dilip";
		
	}
	
	public int sub(int b,int c) {
		return b-c;
		
	}
	
	public static void main(String[] args) {
		
		InputArguments ia= new InputArguments();
		ia.add(34, 6);
		System.out.println(ia.sub(10, 4));
		System.out.println(ia.mul(4, 5));
		String name = ia.name();
		System.out.println(name);
		
		
		
		
	}
}
