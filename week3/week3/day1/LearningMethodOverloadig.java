package week3.day1;

public class LearningMethodOverloadig {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public String name() {
		return "Dilip";
		
	}
	
	public String name(String firstname, String lastname) {
		return firstname +"  "+ lastname;
		
	}
	
	public static void main(String[] args) {
		
		LearningMethodOverloadig mol= new LearningMethodOverloadig();
		
		mol.add(10, 10);
		
		System.out.println(mol.add(3, 4, 3));
		
		String name = mol.name();
		System.out.println(name);
		
		String name2 = mol.name("Dilip","kumar");
		System.out.println(name2);
		
		
		
	}
}
