package Week5;

public class Constructor {

	int studid;
	String name;
	boolean stustatus;
	
	
	
	//default constructor
	Constructor(){
		studid=20;
		name="dilip";
		stustatus=true;
	}
	
	
	//paramterized constructor
	
	
	
	Constructor(int studid,String name,boolean stustatus){
		
		this.studid=studid;
		
		this.name= name;
		
		this.stustatus=stustatus;
	}

	public static void main(String[] args) {
	Constructor obj= new Constructor(21,"aravind",false);
	System.out.println(obj.studid);
	System.out.println(obj.name);
	
	
	}
}
