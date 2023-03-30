package exceptionHandling;

public class LearnFinally {

	public static void main(String[] args) {
		String s="vidya";
		
		s=s.concat("Bharathi");
	/*	
		try {
		String concat = s.concat("Exception");
		
		}catch(Exception e) {
			System.out.println(e);
		}finally
		{
	  System.out.println("taskkill//f/im chromedriver.exe");
		}*/

				
		try {
			String concat = s.concat("Exception");
		}finally {
			System.out.println("Close the cloud connection");
		}
		//finalize -->garbage collector will be done this
		
}
}