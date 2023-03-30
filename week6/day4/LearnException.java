package exceptionHandling;

public class LearnException {

	public static void main(String[] args) throws InterruptedException {
		
		int x= 10;
		int y=1;
		int[] arr= {1,2,3,4,5};
		Thread.sleep(2000);//may get the exception
				
		try {
			System.out.println("The result is :" +x/y);
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println("Invalid Input");		
			
		}
		
		System.out.println("End of the Program");

	}

}
