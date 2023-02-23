package week1.day2;

public class LearningIfElse {

	public static void main(String[] args) {
		int num=0;
		if(num>0) {
			System.out.println("positive :" +num);
		}else if(num==0) {
			System.out.println("the number neutral : " + num);
		}
		
		else {
			System.out.println("negative : "+num);
		}

		int age=18;
		if(age>=18) {
			System.out.println("they can vote");
		}else {
			System.out.println("they cannot vote");
		}
	}

}
