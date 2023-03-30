package baseclass;

public class Learnthrows {

	public static void cal(int x, int y) throws InterruptedException {
		if(x>y) {
			Thread.sleep(2000);
			System.out.println(x-y);
		}else {
			throw new RuntimeException("Invalid inputs");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		cal(2,12);
		

	}

}
