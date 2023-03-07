package week3.day1;

public class FatherInhertaince extends GrandFatherInhertiance {

	public void ownhouse() {
		System.out.println("my father have 7bhk house in ECR");
	}
	
	public static void main(String[] args) {
		
		FatherInhertaince obj= new FatherInhertaince();
		obj.house();
		obj.land();
		obj.ownhouse();
		
	}
}
