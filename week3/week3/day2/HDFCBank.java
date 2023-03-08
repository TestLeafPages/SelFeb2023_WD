package week3.day2;

public class HDFCBank implements Rbi,Rbi1{

	@Override
	public void kyc() {
System.out.println("we will follow");		
	}

	@Override
	public void limit() {
		System.out.println("limit checking");
		
	}

	@Override
	public void goldRate() {
		System.out.println("gold loan rate");
	}
public static void main(String[] args) {
	
	
	
	HDFCBank hb=new HDFCBank();
	hb.kyc();
	hb.goldRate();
}
	
}
