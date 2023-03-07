package week3.day1;

public class SonInheritance extends FatherInhertaince{

	public void ownhouse1() {
		System.out.println("3bhk house in porur");
	}
	
	public static void main(String[] args) {
		SonInheritance si= new SonInheritance();
		si.ownhouse();
		
		si.land();
		si.house();
		
		si.ownhouse1();
	}
}
